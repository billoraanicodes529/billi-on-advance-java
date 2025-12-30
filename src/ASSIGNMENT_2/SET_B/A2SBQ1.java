package ASSIGNMENT_2.SET_B;

/*
    Q1:Write a menu driven program (Command line interface) to perform the following operations on student table:
    I. Insert    
    II. Modify    
    III. Delete    
    IV. View All
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class A2SBQ1 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/tybcs210", "postgres", "1234");
             Scanner sc = new Scanner(System.in);
             Statement stmt = conn.createStatement()) {

            Class.forName("org.postgresql.Driver");

            System.out.println("---Menu---");
            System.out.println("1: Insert");
            System.out.println("2: Update");
            System.out.println("3: View");
            System.out.println("4: Delete");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            sc.nextLine(); 

            switch (ch) {
                case 1:
                    System.out.print("Enter Roll_No: ");
                    int rno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Percentage: ");
                    String pert = sc.nextLine();

                    String sql = "INSERT INTO student1 VALUES(" + rno + ",'" + name + "','" + pert + "');";
                    stmt.executeUpdate(sql);
                    System.out.println("Inserted");
                    break;

                case 2:
                    System.out.print("Enter Roll_No: ");
                    int rno1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name1 = sc.nextLine();

                    String sql1 = "UPDATE student1 SET name='" + name1 + "' WHERE roll_no=" + rno1;
                    stmt.executeUpdate(sql1);
                    System.out.println("Updated");
                    break;

                case 3:
                    String sql2 = "SELECT * FROM student1";
                    ResultSet rs = stmt.executeQuery(sql2);
                    while (rs.next()) {
                        System.out.println("Roll No: " + rs.getInt(1));
                        System.out.println("Name: " + rs.getString(2));
                        System.out.println("Percentage: " + rs.getString(3));
                    }
                    rs.close();
                    break;

                case 4:
                    System.out.print("Enter Roll_No to delete the data: ");
                    int rno2 = sc.nextInt();

                    String sql3 = "DELETE FROM student1 WHERE roll_no=" + rno2;
                    stmt.executeUpdate(sql3);
                    System.out.println("Deleted");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
