//Create a program to calculate product of two floating points numbers
import java.util.Scanner;

public class SecondChallenge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first value= ");
        float a=input.nextFloat();
          System.out.print("Enter Second value= ");
        float b=input.nextFloat();
        System.out.println("Product of "+a+" and "+b+" =" +(a*b));
input.close();
    }
}
