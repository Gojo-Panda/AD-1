package Lab_06;
//Linear Search with using recursion
public class Q_02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 11, 5, 6, 10, 7, 8, 9};
        System.out.println(lSearch1(arr, 10, 0));
    }
    public static int lSearch1(int[] arr, int taget, int i){
        if(i >= arr.length - 1){
            return -1;
        }
        if(arr[i] == taget){
            return i;
        }
        return lSearch1(arr, taget, i + 1);
    }
}
