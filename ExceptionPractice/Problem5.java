package ExceptionPractice;

public class Problem5 {

     public static void print(String name)
            throws IndexOutOfBoundsException,NullPointerException, IllegalArgumentException{
                System.out.println(name);
            }
    public static void main(String[] args) {
        //throw and throws 
    
     print("Riti");
     print("Tyagi");
     
        }
    }

