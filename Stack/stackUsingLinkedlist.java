package Stack;

import java.util.Scanner;
public class stackUsingLinkedlist {

  private Node top;
  private int size;
  static Scanner sc = new Scanner(System.in);

  public void Stack() {
    top = null;
    size = 0;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public void push() {
    System.out.print("Enter the number to input:- ");
    int data = sc.nextInt();
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
    size++;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }
    int poppedElement = top.data;
    top = top.next;
    size--;
    return poppedElement;
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }
    return top.data;
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
    } else {
      Node current = top;
      System.out.print("Stack elements: ");
      while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
      }
      System.out.println();
    }
  }

  private class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public static void main(String[] args) {
        stackUsingLinkedlist stack = new stackUsingLinkedlist();

    while(true){
      System.out.println("Choose the function:- \n1.Push\n2.Pop\n3.Display\n4.Quit Menu");
      
      int choice = sc.nextInt();
      switch(choice){
          case 1 : stack.push(); break;
          case 2 : stack.pop(); break;
          case 3 : stack.display();break;
          default : System.exit(0);
      }
  }
    // System.out.println("Initialize a stack using Linked List");
    // System.out.println("\nInput some elements on the stack:");
    // stack.push(1);
    // stack.push(2);
    // stack.push(3);
    // stack.push(4);
    // stack.push(5);
    // stack.display();
    // System.out.println("\nTop element: " + stack.peek());
    // System.out.println("\nRemove two elements from the stack:");
    // stack.pop();
    // stack.pop();
    // stack.display();
    // System.out.println("\nTop element: " + stack.peek());
  }
}
