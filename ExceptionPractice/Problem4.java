package ExceptionPractice;

public class Problem4 {
    public static void main(String[] args) {
        int age=20;
        try{ 
    //         int c=10/0;
    //  throw new ArithmeticException("New Exception");

    if (age>16){
    
        throw new Exception(" Invalid Age");  }
    
        }
    catch(Exception e){
    System.out.println(e.getMessage());
    }
    
    finally {
        System.out.println("Finally Block");
    }

    //Multiple finally is not allowed....................
//    finally{
//     System.out.println(age);
//    }
}
}