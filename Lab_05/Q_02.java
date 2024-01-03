package Lab_05;

import java.util.Arrays;

public class Q_02 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 1, 2, 3, 5};
        Arrays.sort(arr);
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == 0){
                count++;
            }
            System.out.println(7 - count);
            if(arr[j] != 0){
                for (int i = j; i < arr.length; i++) {
                    arr[i] = arr[i] - 1;
                }      
            }
        }
    } 
}
