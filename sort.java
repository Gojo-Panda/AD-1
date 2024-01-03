import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {50, 2, 2, 44, 3, 5, 6, 7, 4, 3, 5, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int a = arr[i];
                arr[i] = arr[min];
                arr[min] = a;
            }
        }
    }
    
}
