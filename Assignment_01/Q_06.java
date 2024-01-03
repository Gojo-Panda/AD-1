package Assignment_01;

import java.util.Arrays;

public class Q_06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 2;
        Rotate(arr, key, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void Rotate(int arr[], int d, int n) {
    int temp[] = new int[n];
    int k = 0;
    for (int i = d; i < n; i++) {
        temp[k] = arr[i];
        k++;
    }
    for (int i = 0; i < d; i++) {
        temp[k] = arr[i];
        k++;
    }
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}
    
}
