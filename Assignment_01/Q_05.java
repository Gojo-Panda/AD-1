package Assignment_01;

public class Q_05 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i <= n; i++) {
            int x = a;
            a = b;
            b = x + b;
            System.out.print(b + " ");
        }
    }
    
}
