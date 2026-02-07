// Assignment:5;SET:A;Q3: Write a program to create 2 threads. First thread displays “Hello” 5 times & second
// thread displays “Good Bye” 5 times.

package ASSIGNMENT_5.SET_A;

class Demo extends Thread {
    int n;
    String msg;

    Demo(String msg, int n) {
        this.msg = msg;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }
}

public class A5SAQ3 {
    public static void main(String[] args) {
        Demo t1 = new Demo("Hello", 5);
        t1.start();

        Demo t2 = new Demo("Good Byee", 5);
        t2.start();
    }
}
