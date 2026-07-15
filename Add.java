import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        try(Scanner add=new Scanner(System.in)){
        System.out.println("Enter the value of a:");
        int a =add.nextInt();
         System.out.println("Enter the value of b:");
        int b=add.nextInt();
        int c=a+b;
        System.out.println("Sum of "+a+ " and " +b+" ="+c);
    
        
    }
}
}