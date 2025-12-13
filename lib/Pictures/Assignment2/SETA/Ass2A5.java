/*Create a PROJECT table with fields project_id, Project_name, Project_description, Project_Status. etc. Insert values in the table. Display all the details of the PROJECT.*/
import java.io.*; 
import java.sql.*; 
class Ass2A5{ 
 public static void main(String args[]){ 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 try{ 
	Class.forName("org.postgresql.Driver"); 
	Connection con=DriverManager.getConnection("jdbc:postgresql://172.168.0.254/tybcsdb8","tybcs8","3"); 
	if(con==null) 
	     System.out.println("Unable to connect"); 
	else{ 
		Statement stmt=con.createStatement(); 
		System.out.println("Enter Project ID:"); 
		int id=Integer.parseInt(br.readLine()); 
		System.out.println("Enter Project Name:"); 
		String name=br.readLine(); 
		System.out.println("Enter Project Description:"); 
		String des=br.readLine(); 
		System.out.println("Enter Project Status:"); 
		String status=br.readLine(); 
		String sql="insert into Project values("+id+",'"+name+"','"+des+"','"+status+"');"; 
		stmt.executeUpdate(sql); 
		System.out.println("Updated"); 
		String sql1="select * from Project"; 
		ResultSet rs=stmt.executeQuery(sql1); 
		while(rs.next()){ 
			System.out.println("Project Id:"+rs.getInt(1)); 
			System.out.println("Project Name:"+rs.getString(2)); 
			System.out.println("Project Description:"+rs.getString(3)); 
			System.out.println("Project Status:"+rs.getString(4)); 
			} 
			rs.close(); 
			stmt.close(); 
			con.close(); 

	} 
} 
catch(Exception e){} 
} 
}
