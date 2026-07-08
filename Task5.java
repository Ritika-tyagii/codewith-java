import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
     System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Select +,-,/,%");
        char operator=sc.next().charAt(0);
int result;
if (operator == '+') {
result = num1 + num2;
System.out.println("Result: " + result);
} else if (operator == '-') {
result = num1 - num2;
System.out.println("Result: " + result);
} else if (operator == '*') {
result = num1 * num2;
System.out.println("Result: " + result);
} else if (operator == '/') {
if (num2 != 0) {
result = num1 / num2;
System.out.println("Result: " + result);
} else {
System.out.println("Error: Division by zero is not allowed.");
}
} else if (operator == '%') {
if (num2 != 0) {
result = num1 % num2;
System.out.println("Result: " + result);
} else {
System.out.println("Error: Division by zero is not allowed.");
}
} else {
System.out.println("Invalid operator entered.");
}
}
}
    