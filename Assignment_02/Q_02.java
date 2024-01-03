package Assignment_02;

public class Q_02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 43, 4, 2, 3, 5, 5, 3};
        maxmin(arr, arr.length, arr[0], arr[0]);
    }
    public static void maxmin(int[] arr, int n, int max, int min){
        if(n < 1){
            System.out.println("Maximum number in the array is " + max + " Minimum number in the array is " + min);
            return;
        }
        maxmin(arr, n = n -1, Math.max(arr[n], max), Math.min(arr[n], min));
    }
    
}
