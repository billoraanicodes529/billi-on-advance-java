package ASSIGNMENT_2.SET_A;

/*
    Q6.Write a program to display information about the database and list all the 
    tables in the database. (Use DatabaseMetaData).
*/
 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class A2SAQ6 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                     "jdbc:postgresql://localhost:5432/tybcs210", "postgres", "1234")) {

            Class.forName("org.postgresql.Driver");

            DatabaseMetaData dmd = conn.getMetaData();
            System.out.println("DB Name: " + dmd.getDatabaseProductName());
            System.out.println("DB Version: " + dmd.getDatabaseProductVersion());
            System.out.println("DB Driver Name: " + dmd.getDriverName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
