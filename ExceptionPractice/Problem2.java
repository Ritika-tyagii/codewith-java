package ExceptionPractice;

public class Problem2 {
    
    public static void main(String[] args) {
        try{
            int result=10/0;
            System.out.println("Hello");
        }catch(Exception e){
            System.out.println("Exception Handelled");
        }
        System.out.println("World");
}
}

//Guess the output
//Exception Handelled 
//World