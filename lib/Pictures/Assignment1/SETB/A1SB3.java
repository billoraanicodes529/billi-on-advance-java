/*Q3:Write a java program to store 0 to 10 integers in an ArrayList & display only even numbers. */
import java.util.*; 
class A1SB3{ 
public static void main(String args[]){ 
ArrayList a = new ArrayList(); 
for (int i=0;i<=10;i++){ 
a.add(i); 
} 
System.out.println("All Elements of Array List"); 
System.out.println(a); 
System.out.println("Even Elements of Array List"); 
Iterator r =a.iterator(); 
while(r.hasNext()){ 
int n = (Integer)r.next(); 
if(n%2==0) 

System.out.println(n); 
} 
} 

}

