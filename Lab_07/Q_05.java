package Lab_07;
// Given a list n numbers, find the element which appears maximum number of times
public class Q_05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 5, 2, 67, 7, 45, 3, 2, 4, 5, 5};
        count(arr);
    }
    public static void count(int[] arr){
        int n = Integer.MIN_VALUE;
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n){
                n = count;
                p = arr[i];
            }
        }
        System.out.println(n);
        System.out.println(p);
    }
    
}
