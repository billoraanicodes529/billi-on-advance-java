// Assignment:5;SET:B;Q1: Write a java program to display thread information.

package ASSIGNMENT_5.SET_B;

public class A5SBQ1 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();

        System.out.println("Thread Name: " + currentThread.getName() + "\n");

        System.out.println("Thread ID: " + currentThread.getId() + "\n");

        System.out.println("Thread Priority: " + currentThread.getPriority() + "\n");

        System.out.println("Thread State: " + currentThread.getState() + "\n");

        System.out.println("Thread Is Alive: " + currentThread.isAlive() + "\n");
    }
}
