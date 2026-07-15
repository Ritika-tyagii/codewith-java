//Create a program to calculate the area of Triangle

import java.util.Scanner;

public class FourthChallenge {
    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
        System.out.print("Enter value of base of a triangle = ");
        int a=input.nextInt();
         System.out.print("Enter value of altitude of a triangle = ");
        int b=input.nextInt();
        int c= (a*b)*1/2;
        System.out.println("Area of Triangle =" + c);
        input.close();
    }
}
