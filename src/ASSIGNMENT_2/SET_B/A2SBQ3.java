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
	    stmt.executeUpdate(sql);

            System.out.println("Record Updated Successfully.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
