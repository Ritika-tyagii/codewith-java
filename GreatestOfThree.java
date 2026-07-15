import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A= ");
        int A=sc.nextInt();
         System.out.println("Enter the value of B= ");
        int B=sc.nextInt();
         System.out.println("Enter the value of C= ");
        int C=sc.nextInt();
        if (A>B) {
            if(A>C){
                System.out.println("A is greater");
            }
            
        }else if(B>A){
            if(B>C){
                System.out.println("B is greater");
            }
        }else{
            System.out.println("C is greater");
        }
    }
}
