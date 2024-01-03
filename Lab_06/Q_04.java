package Lab_06;

import java.util.Arrays;

public class Q_04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 11, 5, 6, 10, 7, 8, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(bSearch1(arr, 10, 0, arr.length - 1));   
    }
    public static int bSearch1(int[] arr, int target, int i, int j){
        if(i > j){
            return -1;
        }
        int m = (i + j) / 2;
        if(arr[m] == target){
            return m;
        }
        else if(arr[m] < target){
            return bSearch1(arr, target, m + 1, j);
        }
        else{
            return bSearch1(arr, target, i, m - 1);
        }
    }
    
}
