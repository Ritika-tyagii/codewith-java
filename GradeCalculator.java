//Student Grade Calculator Write a Java program to take marks of a student as input and display the grade according to the following conditions:

import java.util.Scanner;

public class GradeCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter marks: ");
int marks = sc.nextInt();

if (marks >= 100) {
System.out.println("Grade A");
} else if (marks >= 75) {
System.out.println("Grade B");
} else if (marks >= 50) {
System.out.println("Grade C");
} else {
System.out.println("Grade D");
}

}
}