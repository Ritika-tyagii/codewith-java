import java.util.Scanner;
public class FabonaciiUsingRecursive {
        public static void main(String[] args) {
  // int n=8;
   Scanner sc=new Scanner(System.in);
    System.out.print("enter the value of n= ");
    int n=sc.nextInt();
   
printNum(n);
    }

    static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.println(n+(n-1));
}
}
