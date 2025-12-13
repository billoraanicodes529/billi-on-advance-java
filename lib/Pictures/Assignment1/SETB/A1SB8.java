/*Q8:Write a program that loads names and phone numbers from a text file and prints the corresponding values from the file.(hint: use hash tables)*/
import java.util.*;
import java.io.*;
class A1SB8
{
public static void main(String args[])throws IOException
{
File f=new File("f1.txt");
Scanner sc=new Scanner(f);
Hashtable<String,String>ht=new Hashtable<String,String>();
for(int i=0;i<3;i++)
{
ht.put(sc.next(),sc.next());
}
System.out.println(ht);
}
}
