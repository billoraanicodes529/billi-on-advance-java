package ASSIGNMENT_2.SET_A;

/*
    Write a program to display information about all columns in the DONAR table using ResultSetMetaData.
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class A2SAQ7 {
    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/tybcs210", "postgres", "1234");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM student1")) {

            Class.forName("org.postgresql.Driver");

            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Column Count: " + rsmd.getColumnCount());
            System.out.println("Column Name: " + rsmd.getColumnName(1));
            System.out.println("Column Datatype: " + rsmd.getColumnTypeName(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
