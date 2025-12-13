/*Q3:Write a java program to accept roll no from user and update its name for student table having fields [rno, name]*/
import java.sql.*; 
import java.io.*; 
class Ass2B3{ 
public static void main(String args[]){ 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
try{ 
	Class.forName("org.postgresql.Driver"); 
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybcs","postgres","postgres"); 
	if(con==null) 
		System.out.println("Unable to connect db"); 
	else{ 
	Statement stmt=con.createStatement(); 
	System.out.println("Enter rollno to update"); 
	int r=Integer.parseInt(br.readLine()); 
	System.out.println("Enter name of the student:"); 
	String name=br.readLine(); 
	String sql="update student1 set name='"+name+"'where roll="+r; 
	stmt.executeUpdate(sql); 
	System.out.println("Updated"); 
	} 
	} 
catch(Exception e){} 
} 
}
