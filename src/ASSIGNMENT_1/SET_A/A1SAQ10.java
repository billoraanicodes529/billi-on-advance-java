// Write a Java program to demonstrate HashTable.

package ASSIGNMENT_1.SET_A;

import java.util.Hashtable;

public class A1SAQ10 {
    public static void main(String[] args) {
        Hashtable<Integer, String> studentInfo = new Hashtable<>();

        studentInfo.put(101, "Umar");
        studentInfo.put(102, "Huzefa");
        studentInfo.put(103, "Nasruddin");
        studentInfo.put(104, "Shahbaaz");
        studentInfo.put(105, "Yunus");

        System.out.println("\nHashtable Created: " + studentInfo + "\n");
    }
}
