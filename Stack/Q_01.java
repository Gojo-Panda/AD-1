package Stack;

public class Q_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 7, 8, 9};
        System.out.println(checkSorted(arr, 0));
    }
    public static boolean checkSorted(int[] arr, int n){
        if(n > arr.length - 2){
            return true;
        }
        if(arr[n + 1] < arr[n]){
            return false;
        }
        return checkSorted(arr, n + 1);
    }
    
}
