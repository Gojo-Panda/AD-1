package Assignment_02;

public class Q_07 {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
    public static int pow(int a, int n){
        if(n < 1){
            return 1;
        }
        return a * pow(a, n -1);
    }
    
}
