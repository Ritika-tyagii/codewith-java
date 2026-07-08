//Write a Java program that takes a number as input and checks whether the number is positive, negative, or zero

import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = sc.nextInt();

if (num > 0) {
System.out.println("The number is Positive.");
} else if (num < 0) {
System.out.println("The number is Negative.");
} else {
System.out.println("The number is Zero.");
}
}
}