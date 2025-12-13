/*Q11:Create a Hashtable with values A=65, B=75, C=95 display it with Enumeration Interface and display it's size also.*/
import java.util.*; 
class A1SA11{ 
public static void main(String args[]){ 

Hashtable h = new Hashtable(); 
h.put("A","75"); 
h.put("B","65"); 
h.put("C","95"); 

System.out.println(h); 
System.out.println(h.size()); 
 Enumeration e=h.keys();
   while(e.hasMoreElements())
   {
        String key=(String)e.nextElement();
      System.out.println(key+"="+h.get(key));
      }
} 
}

