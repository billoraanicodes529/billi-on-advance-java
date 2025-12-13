package ASSIGNMENT_1.SET_B;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.print.Doc;

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
        
        System.out.println("The Details Of Students: \nName:\tPercentage:");

        try {
            while (keys.hasMoreElements() && values.hasMoreElements()) {
                System.out.println(keys.nextElement() + "\t" + values.nextElement());
            }

            System.out.println();

        } catch (Exception e) {
        }
    }
}
