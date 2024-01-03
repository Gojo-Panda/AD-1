package Lab_07;
// Find the missing numbers in an array
public class Q_03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 9};
        // System.out.println(find(arr, 9));
        fiind1(arr, arr.length);
    }
    public static int find(int[] arr, int n){
        int sum = n * (n + 1) / 2;
        int sum1 = 0;
        for(int i = 0; i < arr.length; i++){
            sum1 = sum1 + arr[i];
        }
        return sum - sum1;
    }
    public static void fiind1(int[] arr, int n){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - 1 != arr[i - 1]){
                System.out.println(arr[i] - 1);
            }
        }
    }
    
}
