package ASSIGNMENT_1.SET_B;

import java.util.ArrayList;
import java.util.Iterator;

public class A1SBQ3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }

        System.out.println("All Elements Of ArrayList: " + nums + "\n");

        System.out.print("Even Elements Of ArrayList: ");

        Iterator<Integer> iter = nums.iterator();

        System.out.print("[ ");
        while (iter.hasNext()) {
            int n = iter.next();
            
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("]\n");

    }
}
