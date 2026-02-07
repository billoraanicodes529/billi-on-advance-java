// Assignment:5;SET:B;Q2: Write a java program that implements a multi-thread application that has three threads. First
// thread generates random integer every 1 second and if the value is even, second thread
// computes the square of the number and prints. If the value is odd, the third thread will print the
// value of cube of the number.

package ASSIGNMENT_5.SET_B;

import java.util.*;

public class A5SBQ2 {
    public static void main(String[] args) {
        
        FirstThread t1 = new FirstThread();
        t1.start();
    }
}

class FirstThread extends Thread {
    Random rand = new Random();

    public int n;

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                n = rand.nextInt(10);
                System.out.println("Generate Random Number: " + n);

                if (n % 2 == 0) {
                    SecondThread t2 = new SecondThread(n);
                    t2.start();
                } else {
                    ThirdThread t3 = new ThirdThread(n);
                    t3.start();
                }
                sleep(1000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class SecondThread extends Thread {
    int sqr;

    SecondThread(int n) {
        sqr = n * n;
    }

    public void run() {
        System.out.println("Square Of Number: " + sqr);
    }
}

class ThirdThread extends Thread {
    int cube;

    ThirdThread(int n) {
        cube = n * n * n;
    }

    public void run() {
        System.out.println("Cube Of Number: " + cube);
    }
}