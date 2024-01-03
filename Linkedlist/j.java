import java.util.*;
public class j {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.addFirst("A");
        list.addFirst("B");
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        System.out.println(list.size());
    }
}
