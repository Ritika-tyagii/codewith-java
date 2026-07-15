import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int Year=sc.nextInt();
        if((Year%4==0 && Year%100!=0)||(Year%100==0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a leap Year");
        }
    }
}
