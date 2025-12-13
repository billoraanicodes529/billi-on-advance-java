/*Q6:Write a program that loads names and percentage of a student in Hashtable. Display the Hashtable. 
Accept name of student to be searched and display its percentage. */
import java.util.*; 
import java.io.*; 
class A1SB6{ 
public static void main(String args[]) throws IOException{ 
BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
Hashtable ht= new Hashtable(); 
String name,temp; 
 
ht.put("Arshad",70.7); 
ht.put("Jawad",78.9); 
ht.put("Kamran",98.2); 
ht.put("Miraqa",80.7); 
ht.put("Hussain",59.7); 
ht.put("Qais",86.67); 
Enumeration keys= ht.keys(); 
Enumeration values=ht.elements(); 

Enumeration k=ht.keys(); 
Enumeration v=ht.elements(); 

System.out.println("The details of Students:\nName\tPercentage"); 


try{ 
while(keys.hasMoreElements() && values.hasMoreElements()){ 
System.out.println(keys.nextElement()+"\t"+values.nextElement()); 
} 

System.out.println("Enter the name of the student to be searched: "); 
name=br.readLine(); 
while(k.hasMoreElements() && v.hasMoreElements()){ 
temp=(String)k.nextElement(); 
if(name.equals(temp)) 
{ 
 System.out.println("The percentage of specific student is: "+v.nextElement()); 
} 
v.nextElement(); 
} 

} 
catch (Exception e){ 
} 
} 
}

