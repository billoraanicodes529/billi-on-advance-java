import java.sql.*;
import java.util.Scanner;

public class ass2setB1 {
final static String URL = "jdbc:postgresql://localhost:5432/tybcs";
    final static String USER = "postgres";
     final static String PASS = "postgres";
     

    public static void main(String[] args)throws Exception {
    Class.forName("org.postgresql.Driver");
     Connection con = DriverManager.getConnection(URL, USER, PASS);
  
        if (args.length == 0) {
            System.out.println("Please provide an operation: insert, modify, delete, search, view, exit");
            return;
        }

        String operation = args[0].toLowerCase();

        switch (operation) {
            case "insert":
                insertMobile();
                break;
            case "modify":
                modifyMobile();
                break;
            case "delete":
                deleteMobile();
                break;
            case "search":
                searchMobile();
                break;
            case "view":
                viewAll();
                break;
            case "exit":
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }


    // Insert new mobile record
    public static void insertMobile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Model Number: ");
        String mn = sc.nextLine();

        System.out.print("Model Name: ");
        String name = sc.nextLine();

        System.out.print("Model Color: ");
        String color = sc.nextLine();

        System.out.print("SIM Type: ");
        String sim = sc.nextLine();

        System.out.print("Network Type: ");
        String net = sc.nextLine();

        System.out.print("Battery Capacity: ");
        int battery = sc.nextInt();

        System.out.print("Internal Storage (GB): ");
        int storage = sc.nextInt();

        System.out.print("RAM (GB): ");
        int ram = sc.nextInt();
        sc.nextLine();

        System.out.print("Processor Type: ");
        String processor = sc.nextLine();

        try {
          Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            String sql = "INSERT INTO mobile(model_no,model_name,model_color,sim_type,network_type,tery_capacity,internal_storage,ram,processor_type) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, mn);
            ps.setString(2, name);
            ps.setString(3, color);
            ps.setString(4, sim);
            ps.setString(5, net);
            ps.setInt(6, battery);
            ps.setInt(7, storage);
            ps.setInt(8, ram);
            ps.setString(9, processor);

            ps.executeUpdate();
            System.out.println("Record inserted successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println("Insert Error: " + e);
        }
    }

    // Modify data by Model Number
    public static void modifyMobile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Model Number to modify: ");
        String mn = sc.nextLine();

        System.out.print("Enter new Model Name: ");
        String name = sc.nextLine();

        try {
          Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            String sql = "UPDATE mobile SET model_name=? WHERE model_no=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, mn);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Record updated successfully!");
            else
                System.out.println("Model not found!");

            con.close();
        } catch (Exception e) {
            System.out.println("Modify Error: " + e);
        }
    }

    // Delete record by Model Number
    public static void deleteMobile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Model Number to delete: ");
        String mn = sc.nextLine();

        try {
          Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            String sql = "DELETE FROM mobile WHERE model_no=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mn);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Record deleted successfully!");
            else
                System.out.println("Model not found!");

            con.close();
        } catch (Exception e) {
            System.out.println("Delete Error: " + e);
        }
    }

    // Search by Model Number
    public static void searchMobile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Model Number to search: ");
        String mn = sc.nextLine();

        try {
          Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            String sql = "SELECT * FROM mobile WHERE model_no=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mn);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Model Number: " + rs.getString(1));
                System.out.println("Model Name: " + rs.getString(2));
                System.out.println("Color: " + rs.getString(3));
                System.out.println("SIM Type: " + rs.getString(4));
                System.out.println("Network: " + rs.getString(5));
                System.out.println("Battery: " + rs.getInt(6));
                System.out.println("Storage: " + rs.getInt(7));
                System.out.println("RAM: " + rs.getInt(8));
                System.out.println("Processor: " + rs.getString(9));
            } else {
                System.out.println("Model not found!");
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Search Error: " + e);
        }
    }

    // View all records
    public static void viewAll() {
        try {
          Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            String sql = "SELECT * FROM mobile";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("----- MOBILE TABLE -----");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getString(3) + " | " +
                        rs.getString(4) + " | " +
                        rs.getString(5) + " | " +
                        rs.getInt(6) + " | " +
                        rs.getInt(7) + " | " +
                        rs.getInt(8) + " | " +
                        rs.getString(9));
            }

            con.close();
        } catch (Exception e) {
            System.out.println("View Error: " + e);
        }
    }
}

