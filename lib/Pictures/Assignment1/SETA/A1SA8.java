/*Q8:Write a java program to create a new tree set, add some colors (string) and print out the tree set.*/
import java.util.Set;
import java.util.TreeSet;
public class A1SA8
{
public static void main(String[] args)
{
Set ts=new TreeSet();
ts.add("Red");
ts.add("Pink");
ts.add("Blue");
ts.add("Red");
System.out.println("Members from TreeSet="+ts);
}
}