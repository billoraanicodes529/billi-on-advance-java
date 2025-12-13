/*Q3:Write a java program to insert a record into student table.*/
import java.sql.*; 
import java.io.*; 
class Ass2A3{ 
 public static void main(String args[]){ 
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
  try{ 
     Class.forName("org.postgresql.Driver"); 
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybcs","postgres","postgres"); 
	if(con==null) 
		System.out.println("Unable to connect db"); 
	else{ 
	     Statement stmt=con.createStatement(); 
             System.out.println("Enter student roll_no."); 
             int roll_no=Integer.parseInt(br.readLine()); 
             System.out.println("Enter Student name"); 
             String name=br.readLine(); 
 	     System.out.println("Enter Student percentage"); 
             String percentage=br.readLine(); 
             String sql="insert into student1 values("+roll_no+",'"+name+"','"+percentage+"');"; 
             stmt.executeUpdate(sql); 
	     System.out.println("Updated"); 
	     stmt.close(); 
	     con.close(); 
             
            } 
     } 
catch(Exception e){
} 
}
} 
