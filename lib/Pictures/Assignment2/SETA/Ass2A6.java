/*Q6.Write a program to display information about the database and list all the tables in the database. (Use DatabaseMetaData).*/
import java.io.*; 
import java.sql.*; 
class Ass2A6{ 
 public static void main(String args[]){ 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 try{ 
	Class.forName("org.postgresql.Driver"); 
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybcs","postgres","postgres"); 
	if(con==null) 
	     System.out.println("Unable to connect"); 
	else{ 
		DatabaseMetaData dmd=con.getMetaData(); 
		System.out.println("DB Name:"+dmd.getDatabaseProductName()); 
		System.out.println("DB Version:"+dmd.getDatabaseProductVersion()); 
		System.out.println("DB Driver Name:"+dmd.getDriverName()); 
		con.close(); 
} 
} 
catch(Exception e){} 
} 
}
