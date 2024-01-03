package Assignment_01;


import java.util.ArrayList;

public class Q_02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(minmax(arr));
    }
    public static ArrayList<Integer> minmax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
    }
    
}
