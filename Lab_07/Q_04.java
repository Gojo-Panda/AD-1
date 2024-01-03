package Lab_07;
// Given an array of integers, find the element pair with minimum difference
public class Q_04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 9};
        System.out.println(diff(arr));
    }
    public static int diff(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                ans = arr[j] - arr[i];
            }
        }
        return ans;
    }
    
}
