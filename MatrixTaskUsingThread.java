package Multithreading;

// package Multithreading;
// class MyThread1 extends Thread{
//     public void run(){
//       int num=0,i=0;
//       int count=0;
// for( i=1;i<=50;i++){
//   int check =0;
  
//     for( num=i;num>=1;num--){
//     if(i%num==0){
//         check++;
        
//     }
// } if(check==2){
//     System.out.println(i);
// count++;
// }
//     }
//     System.out.println("Total Prime Numbers between 1-50: " +count);
//     }

// }
//  class MyThread2 extends Thread{
//     public void run(){
//       int num=0,i=0;
//       int count=0;
// for( i=51;i<=100;i++){
//   int check =0;
  
//     for( num=i;num>=1;num--){
//     if(i%num==0){
//         check++;
        
//     }
// } if(check==2){
//     System.out.println(i);
// count++;
// }
//     }
//     System.out.println("Total Prime Numbers between 51-100: " +count);
//     }
//  }


// public class TaskThread {
//     public static void main(String[] args) {
//         MyThread1 t1=new MyThread1();
//         Thread t=new Thread(t1);
// t.start();

//       MyThread2 t2=new MyThread2();
//         Thread th=new Thread(t2);
// th.start();
//     }
// }



//............................Task 2...........................................

// public class MatrixTaskUsingThread {
//     public static void main(String[] args) {
//         MatrixTask m = new MatrixTask();
//         Thread thread = new Thread(m);
//         thread.start();
//     }
// }

// class MatrixTask implements Runnable {
//     public void run() {
//         int[][] matrix1 = {
//                 {10, 20, 30, 40},
//                 {5, 15, 25, 35},
//                 {2, 4, 6, 8},
//                 {100, 200, 300, 4},
//         };
//         int[] rowSums = new int[4];

        
//         for (int i = 0; i < 4; i++) {
//             int sum = 0;
//             for (int j = 0; j < 4; j++) {
//                 sum += matrix1[i][j];
//             }
//             rowSums[i] = sum;
//         }

    
//         for (int i = 0; i < 4; i++) {
//             System.out.println(" Row " + (i + 1) + " Sum : " + rowSums[i]);
//         }
//     }
// }
class StudentAverageCalculator implements Runnable {
    public void run() {
        int[][] studentsMarks = {
            {85, 90, 78, 88}, 
            {70, 65, 80, 75}, 
            {95, 92, 96, 94}, 
            {60, 72, 68, 70} 
        };
        int[] sumMarks = new int[4];
        int[] averageMarks = new int[4];
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += studentsMarks[i][j];
            }
            sumMarks[i] = sum;
            averageMarks[i] = sum / 4;
        }for (int i = 0; i < 4; i++) {
            System.out.println("Student " + (i + 1) + " | Average Marks: " + averageMarks[i]);

        }
        int classSum= sumMarks[0] + sumMarks[1] + sumMarks[2] + sumMarks[3];
         System.out.println("Class Total=: " + classSum);
        int classAverage = averageMarks[0] + averageMarks[1] + averageMarks[2] + averageMarks[3];
        System.out.println("Class Average=: " + classAverage);
      
  
    }
}
public class MatrixTaskUsingThread {
    public static void main(String[] args) {
        StudentAverageCalculator s1 = new StudentAverageCalculator();
        Thread thread = new Thread(s1);
        thread.start();
    }
}