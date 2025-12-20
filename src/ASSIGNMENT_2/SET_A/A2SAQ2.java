package ASSIGNMENT_2.SET_A;

/* 
   Q2. Write a Java program to display students’ details in tabular format.
*/

import java.sql.*;

public class A2SAQ2 {
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:postgresql://localhost:5432/tybcs210"; 
        String username = "postgres"; 
        String password = "1234";
        String query = "SELECT * FROM student"; 

        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("----- Students Table -----");
        System.out.println("ID:\tName\tAddress\tContact_No");

        while (rs.next()) {
            int id = rs.getInt("rno");
            String name = rs.getString("name");
            String address = rs.getString("address");
            String contactNo = rs.getString("contact_no");

            System.out.println(id + "\t" + name + "\t" + address + "\t" + contactNo);
            System.out.println("-----------------------------------");
        }

        stmt.close();
        conn.close();
        System.out.println("Connection Closed....");
    }
}
