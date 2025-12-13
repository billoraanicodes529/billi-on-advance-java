package ASSIGNMENT_1.SET_B;

import java.io.*;
import java.util.*;

public class A1SBQ4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter How Many Numbers Do You Want To Enter: ");
        int num = sc.nextInt();

        TreeSet<Integer> numSet = new TreeSet<>();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter [" + (i + 1) + "] Number: ");
            int n = sc.nextInt();
            numSet.add(n);
        }

        System.out.println(numSet);

        System.out.print("Enter Search Element: ");
        int search = sc.nextInt();
        boolean found = false;

        Iterator<Integer> iter = numSet.iterator();

        while (iter.hasNext()) {
            int el = iter.next();

            if (el == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element Found In TreeSet!");
        } else {
            System.out.println("Element Not Found!");
        }

        sc.close();
    }
}
