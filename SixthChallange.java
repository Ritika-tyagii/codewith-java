//Create a program to calculate Compound Interest

import java.util.Scanner;

public class SixthChallange {
    public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of P= ");
        int P=input.nextInt();
         System.out.print("Enter the value of R= ");
        float R=input.nextFloat();
        
         System.out.print("Enter the value of T= ");
        float T=input.nextFloat();
        double CI=P*Math.pow((1+R/100),T);
        System.out.println("Compound interest="+CI);
input.close();
    }
}
