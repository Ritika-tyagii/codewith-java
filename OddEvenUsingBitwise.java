import java.util.Scanner;

public class OddEvenUsingBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num= ");
        int num=sc.nextInt();
        if((num&1)==1){
            System.out.println("Your no. is odd");
        }else{
            System.out.println("Your no. is even");
        }
    }
}
