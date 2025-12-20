package ASSIGNMENT_2.SET_A;

/* 
   Q2. Write a Java program to display employee details in tabular format.
*/

import java.sql.*;

public class A2SAQ1 {
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:postgresql://localhost:5432/tybcs210"; 
        String username = "postgres"; 
        String password = "1234";
        String query = "SELECT * FROM employee"; 

        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("----- Employee Table -----");
        System.out.println("ID:\tName\tAddress\tContact_No\tSalary");

        while (rs.next()) {
            int emp_id = rs.getInt("emp_id");
            String emp_name = rs.getString("emp_name");
            String emp_address = rs.getString("emp_address");
            String emp_contact_no = rs.getString("emp_contact_no");
            String emp_salary = rs.getString("emp_salary");

            System.out.println(emp_id + "\t" + emp_name + "\t" + emp_address + "\t" + emp_contact_no + "\t" + emp_salary);
            System.out.println("-----------------------------------");
        }

        stmt.close();
        conn.close();
        System.out.println("Connection Closed....");
    }
}
