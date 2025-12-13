/*Q2:Construct linked List containing names of colors: red, blue, yellow and orange. Then extend your program to do the following:
i. Display the contents of the List;
ii. Display the contents of the List in reverse order using a ListIterator;
iii. Create another list containing pink and green. Insert the elements of this list between blue and yellow. */
import java.util.*; 
class A1SB2{ 
public static void main(String args[]){ 
LinkedList l= new LinkedList(); 

l.add("Red"); 
l.add("Blue"); 
l.add("Yellow"); 
l.add("Orange"); 


System.out.println(l); 
System.out.println("Content of the list using iterator"); 
 ListIterator i=l.listIterator();
while(i.hasNext()){ 
System.out.println(i.next()); 
} 
 
System.out.println("Displaying in Reverse Order"); 

 
while(i.hasPrevious()){ 
System.out.println(i.previous()); 
} 
System.out.println("elements of this list between blue and yellow"); 
LinkedList l1=new LinkedList(); 
l1.add("Pink"); 
l1.add("Green"); 
l.addAll(2,l1); 
System.out.println(l); 
} 
}

