/*Q1:Accept ‘n’ integers from the user. Store and display integers in sorted order having proper collection class.The collection should not accept duplicate elements.*/
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A1SB1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Use TreeSet for sorted order and no duplicates
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)  {
            System.out.print("Integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            ts.add(num); // Adding to TreeSet handles sorting and uniqueness
        }

        System.out.println("\n integers in sorted order:");
        for (int num : ts) {
            System.out.println(num);
        }

        scanner.close();
    }
}
