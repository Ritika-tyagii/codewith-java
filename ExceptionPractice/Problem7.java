package ExceptionPractice;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
try{
       System.out.println("Enter Password");
      
String inputPassword =sc.nextLine();
           // String inputPassword = null; 
           
           if (inputPassword.equals("1234")) { 
                System.out.println("Login Success!");
           
            }else{
                System.out.println("Wrong Password");
            }
            
        } catch (Exception e) {
            
            System.out.println("Error: Wrong password entered!"); 
            System.out.println("Exception" + e);
        }
    sc.close();
 }

}
