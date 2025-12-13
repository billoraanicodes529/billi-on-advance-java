/*Q10:Create the hash table that will maintain the mobile number and student name. Display the contact list.*/
import java.util.*;
class A1SA10
{
public static void main(String[] args)
{
Hashtable<String,String>hashtable=new Hashtable<String,String>();
hashtable.put("1234567891","Ram");
hashtable.put("9955557110","Gayatri");
hashtable.put("9423094234","Soham");
System.out.println(hashtable);
}
}