package Assignment_01;

public class Q_08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 7, 9};
        System.out.println(smallestPositive(arr));
    }
    public static int smallestPositive(int[] arr){
        	for (int i = 1; i < arr.length; i++) {
				if(arr[i - 1] + 1 != arr[i]) {
					return i;
				}
			}
        	return 0;
        }
    }
