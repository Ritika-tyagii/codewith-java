
import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A= ");
        int A=sc.nextInt();
         System.out.println("Enter the value of B= ");
        int B=sc.nextInt();
        int BitwiseAnd=A&B;
        System.out.println("Bitwise And: "+BitwiseAnd);
         int BitwiseOR=A|B;
                 System.out.println("Bitwise OR: "+BitwiseOR);
                  int BitXOR=A^B;
                 System.out.println("Bitwise XOR: "+BitXOR);
                 int result=~A;
                 System.out.println(result);
    }
}
