// Assignment:5;SET:A;Q2: Write a program in which thread sleep for 6 sec in the loop in reverse order from 100
// to 1 and change the name of thread.

package ASSIGNMENT_5.SET_A;

public class A5SAQ2 {
    public static void main(String[] args) {
        try {
            Thread t = Thread.currentThread();

            t.setName("Reverse Thread");

            System.out.println(t);

            for (int i = 100; i >= 1; i--) {
                System.out.println(i + ".] ");
                Thread.sleep(6000);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }   
}
