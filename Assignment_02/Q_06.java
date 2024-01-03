package Assignment_02;

public class Q_06 {
    public static void main(String[] args) {
        hexdec(960);
    }
    public static void hexdec(int n){
        if(n < 1){
            return;
        }
        int hex = 0;
        hex = n % 16;
        hexdec(n/16);
        if(hex > 9){
            System.out.print((char)('A' + (hex - 10)));
        }else{
        System.out.print(hex);
        }
    }
}