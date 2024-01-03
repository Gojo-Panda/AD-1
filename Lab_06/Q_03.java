package Lab_06;

import java.util.Arrays;

public class Q_03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 11, 5, 6, 10, 7, 8, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(bSearch(arr, 10));      
    }
    public static int bSearch(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int m = (i + j) / 2;
            if(arr[m] == target){
                return m;
            }
            else if(arr[m] < target){
                i = m + 1;
            }
            else{
                j = m;
            }
        }
        return -1;
    }
}

