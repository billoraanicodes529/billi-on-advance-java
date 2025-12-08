package ASSIGNMENT_1.SET_B;

/*
Accept n integers from the user. Store and display integers in sorted order having proper collection class. The collection should not accept
duplicate element.
*/

import java.util.Scanner;
import java.util.TreeSet;

public class A1SBQ1 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Integers To Enter: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter [" + (i + 1) + "] Integer: ");
            int loopNum = sc.nextInt();

            nums.add(loopNum);
        }

        int i = 1;

        System.out.println("\nIntegers In Sorted Order: ");
        for (int val : nums) {
            System.out.println(i + ".] -> " + val);
            i++;
        }

        sc.close();
    }
}
