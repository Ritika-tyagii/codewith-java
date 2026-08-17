package Multithreading;
class MyThread1 extends Thread{
    public void run(){
      int num=0,i=0;
      int count=0;
for( i=1;i<=50;i++){
  int check =0;
  
    for( num=i;num>=1;num--){
    if(i%num==0){
        check++;
        
    }
} if(check==2){
    System.out.println(i);
count++;
}
    }
    System.out.println("Total Prime Numbers between 1-50: " +count);
    }

}
 class MyThread2 extends Thread{
    public void run(){
      int num=0,i=0;
      int count=0;
for( i=51;i<=100;i++){
  int check =0;
  
    for( num=i;num>=1;num--){
    if(i%num==0){
        check++;
        
    }
} if(check==2){
    System.out.println(i);
count++;
}
    }
    System.out.println("Total Prime Numbers between 51-100: " +count);
    }
 }


public class TaskThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        Thread t=new Thread(t1);
t.start();

      MyThread2 t2=new MyThread2();
        Thread th=new Thread(t2);
th.start();
    }
}
