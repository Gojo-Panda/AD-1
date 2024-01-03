package Assignment_02;

public class Q_03 {
    public static void main(String[] args) {
        System.out.println(factor(10));
    }
    public static int factor(int n){
        if(n < 1){
            return 1;
        }
        return n * factor(n - 1);
    }
    
}
