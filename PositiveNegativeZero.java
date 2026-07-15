import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no= ");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Number is negative");
        }else if(num>0){
                  System.out.println("Number is Positive");
        }else{
                  System.out.println("Number is equal to zero");
        }
    }
}
