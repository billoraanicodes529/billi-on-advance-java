/* Q2.Write a java program to display students’ details in tabular format.*/
import java.sql.*;


class Student {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/tybcs"; 
        String username = "postgres"; 
        String password = "postgres";
        String query = "select * from students"; 

       
        Class.forName("org.postgresql.Driver");
  
        Connection con = DriverManager.getConnection(url, username, password);
        
        Statement st = con.createStatement();

        
        ResultSet rs = st.executeQuery(query);

        
        System.out.println("----- Students Table -----");
        System.out.println("ID: " +"\t"+"Name"+"\t"+"Address"+"\t"+"  "+"Contact_No");
            while (rs.next()) {
                int id = rs.getInt("rno");
                String name = rs.getString("name");
                String address = rs.getString("add");
                String contact_no = rs.getString("contact_no");
                
  System.out.println(id +"\t"+ name+"\t"+address+"\t"+"  "+contact_no);
              
                System.out.println("-----------------------------------");
            }
     
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}
