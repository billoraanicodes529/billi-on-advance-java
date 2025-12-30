/*
    Create a PROJECT table with fields project_id, Project_name, Project_description, Project_Status. etc. 
    Insert values in the table. Display all the details of the PROJECT.
*/

package ASSIGNMENT_2.SET_A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class A2SAQ5 {

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/tybcs210";
        String user = "postgres";
        String pass = "1234";

        try (Scanner sc = new Scanner(System.in);
             Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {

            System.out.print("Enter Project ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Project Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Project Description: ");
            String des = sc.nextLine();

            System.out.print("Enter Project Status: ");
            String status = sc.nextLine();

            String insertSql = "INSERT INTO Project(project_id, project_name, project_description, project_status) VALUES ("
                    + id + ", '"
                    + name + "', '"
                    + des + "', '"
                    + status + "')";
            stmt.executeUpdate(insertSql);

            System.out.println("-----------------------------Record inserted-----------------------------");

            String sqlSelect = "SELECT project_id, project_name, project_description, project_status FROM Project";
            try (ResultSet rs = stmt.executeQuery(sqlSelect)) {
                while (rs.next()) {
                    System.out.println("Project Id: " + rs.getInt("project_id"));
                    System.out.println("Project Name: " + rs.getString("project_name"));
                    System.out.println("Project Description: " + rs.getString("project_description"));
                    System.out.println("Project Status: " + rs.getString("project_status"));
                    System.out.println("-------------------------------");
                }
            }
        }
    }
}
