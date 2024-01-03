package Lab_05;


public class Q_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 11, 5, 6, 10, 7, 8, 9};
        reverse(arr);
        System.out.println(isSorted(arr));
    }
    public static void reverse(int[] arr) 
    { 
        int i, t; 
        for (i = 0; i < arr.length / 2; i++) { 
            t = arr[i]; 
            arr[i] = arr[arr.length - i - 1]; 
            arr[arr.length - i - 1] = t; 
        }
    } 
    public static boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }
    
}
