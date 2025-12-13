/*Q1:Write a menu driven program (Command line interface) to perform the following operations on student table.
        I. Insert	II. Modify	III. Delete	IV. View All*/
import java.io.*; 
import java.sql.*; 
class Ass2B1{ 
 public static void main(String args[]){ 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 try{ 
	Class.forName("org.postgresql.Driver"); 
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybcs","postgres","postgres"); 
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
		System.out.println("Enter Roll_No:"); 
		int rno=Integer.parseInt(br.readLine()); 
		System.out.println("Enter Name:"); 
		String name=br.readLine(); 
		System.out.println("Enter Percentage:"); 
		String per=br.readLine(); 
		String sql="insert into students values("+rno+",'"+name+"','"+per+"');"; 
                stmt.executeUpdate(sql); 
		System.out.println("Inserted"); 
		break; 
		case 2: 
		Statement stmt1=con.createStatement(); 
		System.out.println("Enter Roll_No:"); 
		int rno1=Integer.parseInt(br.readLine()); 
		System.out.println("Enter Name:"); 
		String name1=br.readLine(); 
		String sql1="update student21 set name='"+name1+"'where roll_no="+rno1; 
		stmt1.executeUpdate(sql1); 
		System.out.println("Updated"); 
		break; 
		case 3: 
		Statement stmt2=con.createStatement(); 
		String sql2="select * from students"; 
		ResultSet rs=stmt2.executeQuery(sql2); 
		while(rs.next()){ 
		System.out.println("Roll No:"+rs.getInt(1)); 
		System.out.println("Name:"+rs.getString(2)); 
		System.out.println("Percentage:"+rs.getString(3)); 
		} 
		break; 
		case 4: 
		Statement stmt3=con.createStatement(); 
		System.out.println("Enter Roll_No to delete the data:"); 
		int rno2=Integer.parseInt(br.readLine()); 
		String sql3="delete from students where rno="+rno2; 
		stmt3.executeUpdate(sql3); 
		System.out.println("Updated"); 
		} 
} 
} 
catch(Exception e){} 
} 
}
