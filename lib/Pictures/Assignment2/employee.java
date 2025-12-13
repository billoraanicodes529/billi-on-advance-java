/*Q3.write a java program to insert atleast 5 values in the employee table (emp_id,emp_name,emp_add,emp_salary).*/
import java.sql.*;
import java.util.Scanner;

public class employee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:postgresql://localhost:5432/tybcs";  
        String user = "postgres";                                      
        String pass = "postgres";                            

        try {
            
            Class.forName("org.postgresql.Driver");

           
            Connection con = DriverManager.getConnection(url, user, pass);

          
            String sql = "INSERT INTO employee(emp_id, emp_name, emp_add, emp_salary) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

           
            
         System.out.println("\nEnter How may Employee you want to enter ");
         int n=sc.nextInt(); 

            for (int i = 1; i <= n; i++) {

                System.out.println("\nEnter details for Employee " + i);

                System.out.print("Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine(); 

                System.out.print("Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Employee Address: ");
                String add = sc.nextLine();

                System.out.print("Employee Salary: ");
                double salary = sc.nextDouble();

              
                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setString(3, add);
                pst.setDouble(4, salary);

                pst.executeUpdate();
            }

            System.out.println("\nAll Employee Records Inserted Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

