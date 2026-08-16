package ExceptionPractice;

public class Problem1 {
    public static void main(String[] args) {
        int a=18;
        int b=0;
        int c;
        try{
            c=a/b;
        // }catch (ArithmeticException e){
        //     System.out.println("Error: Division by zero is not allowed.");
        // }
    }finally{
        System.out.println("Completed the division operation.");
    }
}
}

