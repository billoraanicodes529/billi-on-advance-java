/*Q6:Write a java program to accept names of ‘n’ cities, insert same into array list Collection and display the contents of same array list, also remove all these elements.*/
import java.util.*; 
import java.io.*; 
class A1SA6{ 
public static void main(String args[]) throws IOException{ 
BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
ArrayList a = new ArrayList(); 

System.out.println("Enter Total Number of Cities? "); 
int n = Integer.parseInt(br.readLine()); 

for(int i=1; i<=n ; i++){ 
System.out.println("Enter "+ i + " city: "); 
a.add(br.readLine()); 
} 

System.out.println("Elements of ArrayList: "); 
System.out.println(a); 
a.clear(); 
System.out.println("After Removing All ELements."); 
System.out.println(a); 
} 

}
