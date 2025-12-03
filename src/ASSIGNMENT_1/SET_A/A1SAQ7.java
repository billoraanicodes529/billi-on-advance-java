/*
Write a Java program to read n names of your friends, store it into LinkedList, also display contents of the same
using Iterator.
*/

package ASSIGNMENT_1.SET_A;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class A1SAQ7 {
    public static void main(String[] args) {
        LinkedList<String> frdNames = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number Of Names To Enter: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter [" + (i + 1) + "] Friend Name: ");
            String name = sc.nextLine();

            frdNames.add(name);
        }

        System.out.println("\nNames Of Friends Entered: \n");
        
        Iterator<String> iter = frdNames.iterator();

        int i = 1;
        while (iter.hasNext()) {
            System.out.println(i + ".] " + iter.next());
            i++;
        }
        
        System.out.println();
        sc.close();
    }
}
