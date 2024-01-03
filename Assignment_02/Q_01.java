package Assignment_02;

public class Q_01 {
    public static void main(String[] args) {
        System.out.println(sumn(10));
    }
    public static int sumn(int n){
        if(n <= 0){
            return n;
        }
        return n + sumn(n - 1);
    }
}
