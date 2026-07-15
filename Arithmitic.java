

import java.util.Scanner;

public class Arithmitic {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
               System.out.print("Enter the value of a= ");
        int a=input.nextInt();
        System.out.print("Enter the value of b= ");
 int b=input.nextInt();
 System.out.println("Sum="+(a+b));
  System.out.println("Sub="+(a-b));
   System.out.println("Mul="+(a*b));
    System.out.println("Div="+(a/b));
     System.out.println("Modulus="+(a%b));
     input.close();
    }
}
