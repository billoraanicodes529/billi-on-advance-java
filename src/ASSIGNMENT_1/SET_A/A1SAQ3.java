// Assignment:1;SET:A;Q3.] Write a java program to demonstrate stack.

package ASSIGNMENT_1.SET_A;

import java.util.Stack;

public class A1SAQ3 {
    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.push(101);
        stk.push("Iron Man");
        stk.push(102);
        stk.push("Captain America");

        System.out.println("\nStack Created: " + stk + "\n");
    }
}
