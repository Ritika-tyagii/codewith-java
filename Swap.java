//Create a progam to swap two numbers


import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a= input.nextInt();
         System.out.print("Enter value of b: ");
        int b= input.nextInt();
        //using third variable
        //c=a;
        //a=b;
        //b=c;
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("Value of a= "+a);
        System.out.println("Value of b= "+b);
        System.out.println("swapping Done");
        input.close();
    }
}
