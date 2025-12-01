// Assignment:1;SET:A;Q5.] Write a java program to demonstrate TreeSet.

package ASSIGNMENT_1.SET_A;

import java.util.TreeSet;

public class A1SAQ5 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Zaid");
        ts.add("Yunus");
        ts.add("Adnan");
        ts.add("Huzefa");
        ts.add("Khalid");

        System.out.println("\nSorted Alphabetically: " + ts + "\n");
    }
}
