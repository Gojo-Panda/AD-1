package Assignment_01;

public class Q_01{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 6;
        if(linearSearch(arr, key) == -1){
            System.out.println(key + "was not found");
        }else{
            System.out.println(key + "was found at location " + linearSearch(arr, key));
        }
    }
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;         
            }
        }
        return -1;
    }
}