/*Q2:Create a MOBILE table with fields Model_Number, Model_Name, Model_Color, Sim_Type, NetworkType, BatteryCapacity, InternalStorage, RAM and ProcessorType. Insert values in the table. Write a menu driven program to pass the input using Command line argument to perform the following operations on MOBILE table.
        I. Insert  II. Modify	III. Delete	IV. View All.*/
import java.io.*; 
import java.sql.*; 
class Ass2B2{ 
 public static void main(String args[]){ 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 try{ 
	Class.forName("org.postgresql.Driver"); 
	Connection con=DriverManager.getConnection("dbc:postgresql://localhost:5432/tybcs","postgres","postgres"); 
	if(con==null) 
	     System.out.println("Unable to connect"); 
	else{ 
		System.out.println("---Menu---"); 
		System.out.println("1:Insert"); 
		System.out.println("2:Update"); 
		System.out.println("3:View"); 
		System.out.println("4:Delete"); 
		System.out.println("Enter your choice"); 
		int ch=Integer.parseInt(br.readLine()); 
		switch(ch){ 
		case 1: 
		Statement stmt=con.createStatement(); 
		System.out.println("Enter Model Number:"); 
		int mno=Integer.parseInt(br.readLine()); 
		System.out.println("Enter Model Name:"); 
		String name=br.readLine(); 
		System.out.println("Enter Model Color:"); 
		String mcol=br.readLine(); 
		System.out.println("Enter Sim Type:"); 
		String sim=br.readLine(); 
		System.out.println("Enter Network Type:"); 
		String nt=br.readLine(); 
		System.out.println("Enter Battery Capacity:"); 
		String bc=br.readLine(); 
		System.out.println("Enter Internal Storage:"); 
		int is=Integer.parseInt(br.readLine()); 
		System.out.println("Enter RAM:"); 
		String ram=br.readLine(); 
		System.out.println("Enter Processor Type:"); 
		String pt=br.readLine(); 
		String sql="insert into mobile values("+mno+",'"+name+"','"+mcol+"','"+sim+"','"+nt+"','"+bc+"',"+is+",'"+ram+"','"+pt+"');"; 
                stmt.executeUpdate(sql); 
		System.out.println("Inserted"); 
		break; 
		case 2: 
		Statement stmt1=con.createStatement(); 
		System.out.println("Enter Model Number:"); 
		int mn1=Integer.parseInt(br.readLine()); 
		System.out.println("Enter Model Name:"); 
		String name1=br.readLine(); 
		String sql1="update mobile set name='"+name1+"'where Model_Number="+mn1; 
		stmt1.executeUpdate(sql1); 
		System.out.println("Updated"); 
		break; 
		case 3: 
		Statement stmt2=con.createStatement(); 
		String sql2="select * from mobile"; 
		ResultSet rs=stmt2.executeQuery(sql2); 
		while(rs.next()){ 
		System.out.println("Model Number:"+rs.getInt(1)); 
		System.out.println("Model Name:"+rs.getString(2)); 
		System.out.println("Model Color:"+rs.getString(3)); 
		System.out.println("Sim Type:"+rs.getString(4)); 
		System.out.println("Network Type:"+rs.getString(5)); 
		System.out.println("Battery Capacity:"+rs.getString(6)); 
		System.out.println("Internal Storage:"+rs.getInt(7)); 
		System.out.println("RAM:"+rs.getString(8)); 
		System.out.println("Processor Type:"+rs.getString(9)); 
		} 
		break; 
		case 4: 
		Statement stmt3=con.createStatement(); 
		System.out.println("Enter Model Number to delete the data:"); 
		int mn2=Integer.parseInt(br.readLine()); 
		String sql3="delete from mobile where Model_Number="+mn2; 
		stmt3.executeUpdate(sql3); 
		System.out.println("Updated"); 
		} 
} 
} 
catch(Exception e){} 
} 
}
