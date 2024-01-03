package Lab_07;
// Find the first repeated element in an array
public class Q_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 5, 2, 67, 7, 45, 3, 2, 4, 5, 5};
        System.out.println(repeat(arr));
    }
    public static int repeat(int[] arr){
        // int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[j];
                }
                // if(count > 1){
                //     return arr[j];
                // }
            }
        }
        return -1;
    }
}
