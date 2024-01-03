package Lab_07;
// Print the duplicates in an array
import java.util.ArrayList;

public class Q_02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 5, 2, 67, 7, 45, 3, 2, 4, 5, 5};
        System.out.println(duplicate(arr));
    }
    public static ArrayList<Integer> duplicate(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    ans.add(arr[i]);
                    break;
                }
            }
        }
        return ans;
    }
    
}
