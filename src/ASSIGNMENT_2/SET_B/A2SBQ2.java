/*
    Q2:Create a MOBILE table with fields Model_Number, Model_Name, Model_Color, Sim_Type, NetworkType, BatteryCapacity, 
    InternalStorage, RAM and ProcessorType. Insert values in the table. Write a menu driven program to pass the input 
    using Command line argument to perform the following operations on MOBILE table.
    I. Insert  
    II. Modify	
    III. Delete	
    IV. View All.
*/

package ASSIGNMENT_2.SET_B;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class A2SBQ2 {
    public static void main(String args[]) {
        try {
            Class.forName("org.postgresql.Driver");

            try (Scanner sc = new Scanner(System.in);
                 Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybcs210", "postgres", "1234")) {

                System.out.println("---Menu---");
                System.out.println("1: Insert");
                System.out.println("2: Update");
                System.out.println("3: View");
                System.out.println("4: Delete");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        try (Statement stmt = conn.createStatement()) {
                            System.out.print("Enter Model Number: ");
                            int mno = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Model Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Model Color: ");
                            String mcol = sc.nextLine();

                            System.out.print("Enter Sim Type: ");
                            String sim = sc.nextLine();

                            System.out.print("Enter Network Type: ");
                            String nt = sc.nextLine();

                            System.out.print("Enter Battery Capacity: ");
                            String bc = sc.nextLine();

                            System.out.print("Enter Internal Storage: ");
                            int is = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter RAM: ");
                            String ram = sc.nextLine();

                            System.out.print("Enter Processor Type: ");
                            String pt = sc.nextLine();

                            String sql = "INSERT INTO mobile VALUES(" + mno + ",'" + name + "','" + mcol + "','" + sim + "','" + nt + "','" + bc + "'," + is + ",'" + ram + "','" + pt + "')";
                            stmt.executeUpdate(sql);
                            System.out.println("Inserted successfully.");
                        }
                        break;

                    case 2:
                        try (Statement stmt = conn.createStatement()) {
                            System.out.print("Enter Model Number to update: ");
                            int mn1 = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter New Model Name: ");
                            String name1 = sc.nextLine();

                            String sql = "UPDATE mobile SET name='" + name1 + "' WHERE Model_Number=" + mn1;
                            stmt.executeUpdate(sql);
                            System.out.println("Updated successfully.");
                        }
                        break;

                    case 3:
                        try (Statement stmt = conn.createStatement();
                             ResultSet rs = stmt.executeQuery("SELECT * FROM mobile")) {

                            while (rs.next()) {
                                System.out.println("Model Number: " + rs.getInt(1));
                                System.out.println("Model Name: " + rs.getString(2));
                                System.out.println("Model Color: " + rs.getString(3));
                                System.out.println("Sim Type: " + rs.getString(4));
                                System.out.println("Network Type: " + rs.getString(5));
                                System.out.println("Battery Capacity: " + rs.getString(6));
                                System.out.println("Internal Storage: " + rs.getInt(7));
                                System.out.println("RAM: " + rs.getString(8));
                                System.out.println("Processor Type: " + rs.getString(9));
                                System.out.println("-----------------------");
                            }
                        }
                        break;

                    case 4:
                        try (Statement stmt = conn.createStatement()) {
                            System.out.print("Enter Model Number to delete: ");
                            int mn2 = sc.nextInt();

                            String sql = "DELETE FROM mobile WHERE Model_Number=" + mn2;
                            stmt.executeUpdate(sql);
                            System.out.println("Deleted successfully.");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}