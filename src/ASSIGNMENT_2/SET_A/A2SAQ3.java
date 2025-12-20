/* 
   Q3: Write a Java program to insert multiple records into student table.
*/

import java.io.*;
import java.sql.*; 

class A2SAQ3 { 
    public static void main(String args[]) { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        try { 
            Class.forName("org.postgresql.Driver"); 
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/tybcs", 
                "postgres", 
                "postgres"
            ); 

            if (conn == null) { 
                System.out.println("Unable to connect to database"); 
            } else { 
                Statement stmt = conn.createStatement(); 

                System.out.println("How many student records do you want to insert?"); 
                int n = Integer.parseInt(br.readLine()); 

                for (int i = 1; i <= n; i++) { 
                    System.out.println("Enter details for student " + i + ":"); 

                    System.out.print("Roll No: "); 
                    int roll_no = Integer.parseInt(br.readLine()); 

                    System.out.print("Name: "); 
                    String name = br.readLine(); 

                    System.out.print("Percentage: "); 
                    String percentage = br.readLine(); 

                    String sql = "INSERT INTO student1 VALUES(" 
                                 + roll_no + ", '" + name + "', '" + percentage + "');"; 

                    stmt.executeUpdate(sql); 
                    System.out.println("Record " + i + " inserted successfully."); 
                    System.out.println("-----------------------------------"); 
                } 

                stmt.close(); 
                conn.close(); 
                System.out.println("Connection Closed...."); 
            } 
        } catch (Exception e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
}
