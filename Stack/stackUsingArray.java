package Stack;

import java.util.Scanner;

public class stackUsingArray {
    static int top = 0;
    static int[] stack = new int[50];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("Choose the function:- \n1.Push\n2.Pop\n3.Display\n4.Quit Menu");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : push(); break;
                case 2 : pop(); break;
                case 3 : display();break;
                default : System.exit(0);
            }
        }
    }
    public static void push(){
        if(top == stack.length){
            System.out.println("Stack Overflow");
            return;
        }
        System.out.print("Enter the number to insert:- ");
        int n = sc.nextInt();
        stack[top + 1] = n;
        top = top + 1;
    }
    public static void push(int n){
        if(top == stack.length){
            System.out.println("Stack Overflow");
            return;
        }
        stack[top + 1] = n;
        top = top + 1;
    }
    public static void pop(){
        if(top == 0){
            System.out.println("Stack Underflow");
        }
        top = top -1;
    }
    public static void display(){
        for (int i = 1; i <= top; i++) {
            System.out.print(stack[i] + "-->");
        }
        System.out.println("top");
    }
}
