package ASSIGNMENT_2.SET_B;

import java.io.*;
import java.sql.*;

public class A2SBQ3 {
    public static void main(String args[]) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybcs210", "postgres", "1234");
            Statement stmt = con.createStatement()) {

            System.out.print("Enter Roll No. To Update: ");
            int r = Integer.parseInt(br.readLine());

            System.out.print("Enter Name Of The Student: ");
            String name = br.readLine();

            String sql = "UPDATE student1 SET name = '" + name + "' WHERE roll = " + r;
            int result = stmt.executeUpdate(sql);

            if (result > 0) {
                System.out.println("Record Updated Successfully.");
            } else {
                System.out.println("No Record Found With Roll No: " + r);
            }

        } catch (SQLException | IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}