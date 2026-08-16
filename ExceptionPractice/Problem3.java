package ExceptionPractice;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
         System.out.println("Enter  value of a= ");
        int a= sc.nextInt();
         System.out.println("Enter  value of b= ");
        int b= sc.nextInt();
        int c;
        try{
           c=a/b;
            System.out.println(c);

        }
        }catch(Exception e){
            System.out.println("Exception Occured" +e);
        }
    }

