// Assignment:5;SET:A;Q1: Program to define a thread for printing text on output screen for ‘n’ number of times.
// Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor.
// Example:
// i.] First thread prints “COVID19” 10 times.
// ii.] Second thread prints “LOCKDOWN2020” 20 times
// iii.] Third thread prints “VACCINATED2021” 30 times

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
            System.out.println(i + ".] " + msg);
        }
        System.out.println();
    }
}

public class A5SAQ1 {
    public static void main(String[] args) {
        Demo t1 = new Demo("COVID-19", 10);
        t1.start();

        Demo t2 = new Demo("LOCKDOWN-2020", 20);
        t2.start();

        Demo t3 = new Demo("VACCINATED-2021", 30);
        t3.start();
    }   
}
