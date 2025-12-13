/*Write a program to display information about all columns in the DONAR table using ResultSetMetaData.*/
import java.io.*; 
import java.sql.*; 
class Ass2A7{ 
 public static void main(String args[]){ 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 try{ 
	Class.forName("org.postgresql.Driver"); 
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybcs","postgres","postgres"); 
	if(con==null) 
	     System.out.println("Unable to connect"); 
	else{ 
	Statement stmt=con.createStatement(); 
	String sql="select * from students"; 
	ResultSet rs=stmt.executeQuery(sql); 
	ResultSetMetaData rsmd=rs.getMetaData(); 
	System.out.println("column count="+rsmd.getColumnCount()); 
	System.out.println("column name="+rsmd.getColumnName(1)); 
	System.out.println("column datatype="+rsmd.getColumnTypeName(1)); 
} 
} 
catch(Exception e){} 
} 
}
