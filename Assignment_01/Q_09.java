package Assignment_01;

import java.util.ArrayList;

public class Q_09 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 9};
        ArrayList<Integer> ans = maximumMinimum(arr);
        for (int i = 0; i < ans.size() / 2;i++) { 		      
            System.out.println(ans.get(i)); 		
        }
        // maxMin(arr);
        // System.out.println(Arrays.toString(arr));
    }
    public static ArrayList<Integer> maximumMinimum(int[] arr){
        // sort(arr);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int j = arr.length - 1;
        while(i < arr.length || j > 0 || i < j){
            ans.add(arr[j]);
            ans.add(arr[i]);
            i++;
            j--;
        }
        return ans;

    }
    // public static void sort(int[] arr){
    //     int a = 0;
    //     int b = 0;
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if(arr[i] > arr[i + 1]){
    //             int c = arr[i];
    //             arr[i] = arr[i + 1];
    //             arr[i + 1] = c;
    //         }
    //     }
    // }
    public static void maxMin(int[] arr){
        // sort(arr);
        int[] ans = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i = i + 2) {
            ans[i] = arr[j];
            j--;
        }
        j = 0;
        for (int i = 1; i < ans.length; i = i + 2) {
            ans[i] = arr[j];
            j++;
        }
    }
    
}
