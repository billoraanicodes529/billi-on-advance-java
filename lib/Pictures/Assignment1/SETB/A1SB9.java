/*Q9:Write a java program to create link list of integer objects. Do the following: 
i. add element at first position 
ii. delete last element 
iii. display the size of link list*/
import java.util.LinkedList;

public class A1SB9 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add some initial elements for demonstration
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Initial list: " + list);  // [10, 20, 30]
        System.out.println("Initial size: " + list.size());

        // (i) add element at first position
        list.addFirst(5);  // adds 5 at the beginning
        System.out.println("After addFirst(5): " + list);
        System.out.println("Size now: " + list.size());

        // (ii) delete last element
        if (!list.isEmpty()) {
            Integer removed = list.removeLast();
            System.out.println("Removed last element: " + removed);
        } else {
            System.out.println("List is empty; nothing to remove.");
        }
        System.out.println("After removeLast(): " + list);
     

        // (iii) display the size
        System.out.println("Final size of list: " + list.size());
    }
}
