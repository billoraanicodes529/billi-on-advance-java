// Assignment:1;SET:A;Q2.] Write a java program to demonstrate LinkedList.

package ASSIGNMENT_1.SET_A;

import java.util.LinkedList;

public class A1SAQ2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("List<>");
        list.add(101);
        list.add("ArrayList<>");
        list.add(202.69);
        list.add("LinkedList<>");
        list.add(true);

        System.out.println("\nLinkedList<> Created: " + list + "\n");
        
    }
}
