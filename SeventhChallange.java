//Create a program to convert Fahrenheit to Celsius

import java.util.Scanner;

public class SeventhChallange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Fahrenheit= ");
        float F=sc.nextFloat();
        float C=(F-32)*5/9;
        System.out.println(C);
        sc.close();
    }
}
