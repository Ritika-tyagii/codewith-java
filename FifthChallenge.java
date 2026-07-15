//Create a program to calculate Simple Interest
import java.util.Scanner;

public class FifthChallenge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of P= ");
        int P=input.nextInt();
         System.out.print("Enter the value of R= ");
        int R=input.nextInt();
        
         System.out.print("Enter the value of T= ");
        int T=input.nextInt();
        int SI=(P*R*T)/100;
        System.out.println("Simple interest="+SI);
        input.close();
    }
}
