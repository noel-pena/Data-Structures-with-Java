package Data_Structures;

import java.util.Arrays;
import java.util.LinkedList;

public class linked_lists {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); // Defines the type that will be used for the linked list
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println("Checking if exists: " + list.contains(10));
        System.out.println("Checking placement of number: " + list.indexOf(20));
        System.out.println("List size: " + list.size());
        var array = list.toArray(); // Converts linked list to an array
        System.out.println(list);
        System.out.println("Converted to array: " + Arrays.toString(array));
    }
}
