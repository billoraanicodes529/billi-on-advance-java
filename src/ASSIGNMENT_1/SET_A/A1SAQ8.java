/*
Write a Java program to create a new TreeSet, add some colors (String) and print out the TreeSet. 
 */

package ASSIGNMENT_1.SET_A;

import java.util.TreeSet;

public class A1SAQ8 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Red");
        colors.add("Violet");
        colors.add("Green");

        System.out.println("\nTreeSet Created: " + colors + "\n");
    }
}
