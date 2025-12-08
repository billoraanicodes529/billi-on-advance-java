package ASSIGNMENT_1.SET_B;

import java.util.*;

public class A1SBQ2 {
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<>();

        color.add("Red");
        color.add("Green");
        color.add("Blue");

        System.out.println("\n" + color + "\n");

        ListIterator colorIter = color.listIterator();

        int i = 1;
        System.out.println("Content Of The LinkedList Using Iterator: ");
        while (colorIter.hasNext()) {
            System.out.println(i + ".] -> " + colorIter.next());
            i++;
        }

        int j = 1;
        System.out.println("\nIn Reverse Order: ");
        while (colorIter.hasPrevious()) {
            System.out.println(j + ".] -> " + colorIter.previous());
            j++;
        }

        LinkedList<String> newColor = new LinkedList<>();

        newColor.add("Violet");
        newColor.add("Pink");

        System.out.println();
        color.addAll(1, newColor);

        System.out.println("Modified LinkedList: " + color);

    }
}
