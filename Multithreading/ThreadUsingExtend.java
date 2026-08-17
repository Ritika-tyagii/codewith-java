package Multithreading;
  class  Mythread extends Thread{
public void run(){
    for( int i=0;i<=5;i++){
        System.out.println("Thread 1: " + i);
    }
}
}
class  Mythread2 extends Thread{
public void run(){
    for( int i=0;i<=5;i++){
        System.out.println("Thread 2: " + i);
    }
}
}

public class ThreadUsingExtend {
public static void main(String[] args) {
    Mythread t1=new Mythread();
    Mythread2 t2= new Mythread2();
    t1.start();
    t2.start();
}
}
