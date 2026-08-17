package Multithreading;
class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}
class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}
public class ThreadByRunnable {
    public static void main(String[] args) {
        MyRunnable1 r1 = new MyRunnable1();
        Thread t1 = new Thread(r1);
        t1.start();
        MyRunnable2 r2 = new MyRunnable2();
        Thread t2 = new Thread(r2); 
        t2.start();
    }
}
