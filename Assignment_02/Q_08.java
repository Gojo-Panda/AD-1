package Assignment_02;

import java.util.Arrays;

public class Q_08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 10};
        Arrays.sort(arr);
        System.out.println(small(arr, 0, arr[arr.length - 1]));
    }
    public static int small(int[] arr, int n, int min){
        if(n > arr.length - 2){
            return min;
        }
        if((arr[n + 1] != arr[n] + 1) && arr[n] > 0){
            return small(arr, n + 1, Math.min(arr[n] + 1, min));
        }else{
            return small(arr, n + 1, min);
        }
    }
    
}
