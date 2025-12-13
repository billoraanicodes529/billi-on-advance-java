/*Q4:Accept n integers from user store them in collection such that duplicate elements are not allowed & search for a particular integer. */
import java.util.*; 
import java.io.*; 
class A1SB4{ 
public static void main(String args[]) throws IOException{ 
BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
System.out.println("Enter How may Number u want enter"); 
int n = Integer.parseInt(br.readLine()); 
TreeSet s= new TreeSet(); 
System.out.println("Enter Numbers"); 
for (int i=0;i<n;i++){ 
s.add(Integer.parseInt(br.readLine())); 
} 

System.out.println(s); 
int f=0; 
System.out.println("Enter Number to be search"); 
int d=Integer.parseInt(br.readLine()); 
Iterator it=s.iterator(); 
while(it.hasNext()){ 
int a=(Integer)it.next(); 
if(a==d){ 
f=1; 
break; 
} 
} 
if(f==1) 
System.out.println("Number Found"); 
else 
System.out.println("Number not Found"); 
} 
}
