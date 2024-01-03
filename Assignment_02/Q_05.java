package Assignment_02;

public class Q_05 {
    public static void main(String[] args) {
        System.out.println(gcd(10, 2));
    }
    public static int gcd(int a, int b){
        if (b < 1){
            return a;
        }
        return gcd(b, Math.abs(a - b));
    }
    
}
