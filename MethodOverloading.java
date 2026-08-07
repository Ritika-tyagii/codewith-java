import java.util.Scanner;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}




public class MethodOverloading {
    public static void main(String[] args) {
       Calculator c1 = new Calculator();
Scanner sc =new Scanner(System.in);
System.out.println("Enter two integers:");
 int a=sc.nextInt();
 int b=sc.nextInt();
 System.out.println("Enter two doubles:");
 double c=sc.nextDouble();
 double d=sc.nextDouble();
 System.out.println("Enter three integers:");
 int e=sc.nextInt();
 int f=sc.nextInt();
 int g=sc.nextInt();


      
        System.out.println("Sum of two integers: " + c1.add(a, b));

        
        System.out.println("Sum of two doubles: " + c1.add(c, d));

        int sum = c1.add(e, f, g);
        System.out.println("Sum of three integers: " + sum);
    }
}
