// Create a Hashtable that will maintain the mobile number and student name. Display the contact list.

package ASSIGNMENT_1.SET_A;

import java.util.Hashtable;

public class A1SAQ11 {
    public static void main(String[] args) {
        Hashtable<String, String> studentInfo = new Hashtable<>();

        studentInfo.put("Umar", "9835241353");
        studentInfo.put("Huzefa", "7653417541");
        studentInfo.put("Nasruddin", "4710358985");
        studentInfo.put("Shahbaaz", "4564361243");
        studentInfo.put("Yunus", "5293646537");

        System.out.println("\nHashtable Created: " + studentInfo + "\n");
        System.out.println("\nHashtable Contacts: " + studentInfo.values() + "\n");
    }
}
