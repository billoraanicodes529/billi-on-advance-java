/*Q4.Write a program to display information about all columns in the DONAR table using ResultSetMetaData.*/
import java.sql.*;
import java.io.*;
class ass2setA4
{
public static void main(String[] args) throws SQLException
{
Connection con= null;
Statement stmt = null;
ResultSet rs = null;
try
{
Class.forName("org.postgresql.Driver");
con= DriverManager.getConnection("jdbc:postgresql:tybcs","postgres","postgres");
stmt=con.createStatement();
rs = stmt.executeQuery("select * from students");
ResultSetMetaData r1 = rs.getMetaData();
int noOfColumns = r1.getColumnCount();
System.out.println("Number of columns = " + noOfColumns);
for(int i=1; i<=noOfColumns; i++)
{
System.out.println("Column No : " + i);
System.out.println("Column Name : " + r1.getColumnName(i));
System.out.println("Column Type : " + r1.getColumnTypeName(i));
System.out.println("Column display size : " + r1.getColumnDisplaySize(i));
}
//con.close();
}
catch(Exception e)
{
System.out.println("ERROR"+e);
}
}
}
