/*Q7:Write a java program to read ‘n’ names of your friends, store it into linked list, also display contents of the same using Iterator.
*/ 
import java.util.*;
public class A1SA7
{
public static void main(String[] args)
{
LinkedList<String>a1=new LinkedList<String>();
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter no of names:");
n=sc.nextInt();
System.out.println("\nEnter Names:");
for(int i=0;i<n;i++)
{
a1.add(sc.next()); 
}
System.out.println("\nName of Friends are:");
Iterator<String>itr=a1.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
