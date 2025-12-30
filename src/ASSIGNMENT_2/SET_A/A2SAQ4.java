/*
    Q4.write a java program to insert atleast 5 values in the employee table 
    (emp_id,emp_name,emp_add,emp_salary),use PreparedStatement.
*/

package ASSIGNMENT_2.SET_A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class A2SAQ4 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/tybcs210";
        String user = "postgres";
        String pass = "1234";

        try (Scanner sc = new Scanner(System.in);
             Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = conn.prepareStatement(
                 "INSERT INTO employee(emp_id, emp_name, emp_address, emp_contact_no, emp_salary) VALUES (?, ?, ?, ?, ?)")) {

            System.out.print("Enter how many employees you want to insert (minimum 5): ");
            int n = sc.nextInt();
            sc.nextLine(); 

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for Employee " + i);

                System.out.print("Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Employee Address: ");
                String address = sc.nextLine();

                System.out.print("Employee Contact No: ");
                String contact = sc.nextLine();

                System.out.print("Employee Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, address);
                ps.setString(4, contact);
                ps.setDouble(5, salary);

                ps.executeUpdate();
            }

            System.out.println("\nAll Employee Records Inserted Successfully!");
        }
    }
}
