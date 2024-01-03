package Lab_06;
// Linear Search without using recursion
public class Q_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 11, 5, 6, 10, 7, 8, 9};
        System.out.println(lSearch(arr, 10));
    }
    public static int lSearch(int[] arr, int taget){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == taget){
                return i;
            }
        }
        return -1;
    }
}
