/*
Create a HashMap with values A = 65, B = 75, C = 95. Display it with size.
*/

package ASSIGNMENT_1.SET_A;

import java.util.HashMap;

public class A1SAQ9 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapCombo = new HashMap<>();

        mapCombo.put("A", 65);
        mapCombo.put("B", 75);
        mapCombo.put("C", 85);

        System.out.println("\nSize Of Created HashMap: " + mapCombo + "\n");

    }
}
