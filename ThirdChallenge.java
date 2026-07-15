// Create a program to calculate the perimeter of a triangle.
import java.util.Scanner;

public class ThirdChallenge {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter first Side of triangle = ");
        int a=input.nextInt();
         System.out.print("Enter Second Side of triangle = ");
        int b=input.nextInt();
         System.out.print("Enter Third Side of triangle = ");
        int c=input.nextInt();
        System.out.println("Perimerter of Triangle ="+ (a+b+c));
        input.close();
    }
}
    