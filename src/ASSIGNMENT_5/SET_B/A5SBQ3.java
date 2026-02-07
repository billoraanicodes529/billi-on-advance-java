// Assignment:5;SET:B;Q3: Write a java program to implement thread priority.

package ASSIGNMENT_5.SET_B;

public class A5SBQ3 {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadA.setPriority(Thread.NORM_PRIORITY);
        threadB.setPriority(Thread.MAX_PRIORITY);
        threadC.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start Thread A...");
        threadA.start();

        System.out.println("Start Thread B...");
        threadB.start();

        System.out.println("Start Thread C...");
        threadC.start();
    }
}

class A extends Thread {
    public void run() {
        System.out.println("Thread A Started...");

        for (int i = 1; i < 5; i++) {
            System.out.println("Thread A:- [" + i + "]");
            System.out.println("Exit From Thread A!\n");
        }
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B Started...");

        for (int i = 1; i < 5; i++) {
            System.out.println("Thread B:- [" + i + "]");
            System.out.println("Exit From Thread B!\n");
        }
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Thread C Started...");

        for (int i = 1; i < 5; i++) {
            System.out.println("Thread C:- [" + i + "]");
            System.out.println("Exit From Thread C!\n");
        }
    }
}
