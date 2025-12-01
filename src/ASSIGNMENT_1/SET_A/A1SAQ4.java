// Assignment:1;SET:A;Q4.] Write a java program to demonstrate Vector.

package ASSIGNMENT_1.SET_A;

import java.util.Vector;

public class A1SAQ4 {
    public static void main(String[] args) {
        Vector<Integer> evenNum = new Vector<>();

        evenNum.add(9);
        evenNum.add(99);
        evenNum.add(999);
        evenNum.add(9999);
        evenNum.add(99999);

        System.out.println("\nVector Created: " + evenNum + "\n");
    }
}
