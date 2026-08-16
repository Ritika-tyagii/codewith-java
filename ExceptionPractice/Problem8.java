package ExceptionPractice;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter your PIN (Numbers only):");
            
         
            int pin = sc.nextInt(); 
            
            if (pin == 1234) {
                System.out.println("Login Success! ");
            } else {
                System.out.println("Wrong PIN! ");
            }
            
        } catch (Exception e) {
         
            System.out.println("\n [SYSTEM SHIELD ACTIVATED]");
            System.out.println("Bro, I asked for numbers, not text! App saved from crashing.");
            System.out.println("Actual Java error message was: " + e);
        }
        
        sc.close();
        System.out.println("\nProgram finished smoothly. No hard crash! ");
    }
}
