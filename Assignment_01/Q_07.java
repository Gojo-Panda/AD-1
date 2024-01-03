package Assignment_01;


public class Q_07 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 0, 8, 7};
        System.out.println(maxSubArraySum(arr));
    }
    public static int maxSubArraySum(int a[]){
        int max_so_far = Integer.MIN_VALUE; 
        int max_ending_here = 0;
        for (int i = 0; i < a.length; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    
}
