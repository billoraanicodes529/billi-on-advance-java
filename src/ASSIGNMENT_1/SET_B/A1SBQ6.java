package ASSIGNMENT_1.SET_B;

import java.io.*;
import java.util.*;


public class A1SBQ6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Double> studentDetail = new Hashtable<>();

        studentDetail.put("Arshad", 70.7);
        studentDetail.put("Jawed", 78.9);
        studentDetail.put("Kamran", 98.2);
        studentDetail.put("Miraqa", 80.7);
        studentDetail.put("Hussain", 59.7);
        studentDetail.put("Umar", 86.67);
        
        Enumeration<String> keys = studentDetail.keys();
        Enumeration<Double> values = studentDetail.elements();

        Enumeration<String> k = studentDetail.keys();
        Enumeration<Double> v = studentDetail.elements();
        
        System.out.println("The Details Of Students: \nName:\t\t\t|\tPercentage:");

        try {
            int i = 1;
            while (keys.hasMoreElements() && values.hasMoreElements()) {
                System.out.println(i + ".] " + keys.nextElement() + "\t\t|\t" + values.nextElement());
                i++;
            }

            System.out.print("\nEnter Student Name To Get Percentage: ");
            String searchName = sc.nextLine();

            while (k.hasMoreElements() && v.hasMoreElements()) {
                String temp = k.nextElement();
                if (searchName.equals(temp)) {
                    System.out.println("\nThe Percentage Of Specific Student Is: " + v.nextElement() + "\n");
                }
                v.nextElement();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
