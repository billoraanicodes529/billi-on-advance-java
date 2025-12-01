// Assignment:1;SET:A;Q6.] Write a java program to accept name of 'n' cities, insert same into ArrayList
// collection and display the contents of same ArrayList, also remove all these element.

package ASSIGNMENT_1.SET_A;

import java.util.ArrayList;
import java.util.Scanner;

public class A1SAQ6 {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number Of Cities You Want To Insert: ");
        int cityNum = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cityNum; i++) {
            System.out.print("Enter [" + (i + 1) + "] City Name: ");
            String city = sc.nextLine();

            cityNames.add(city);
        }

        System.out.println("\nElements Of ArrayList: " + cityNames + "\n");

        cityNames.clear();

        System.out.println("ArrayList Elements Cleared: " + cityNames + "\n");

        sc.close();
    }
}
