package ExceptionPractice;

public class Problem6 {
    public static void main(String[] args) {
      
                try {
                     
            int []a= new int[5];
          
            System.out.printf("Result",a[6]);
        }
        // catch(IndexOutOfBoundsException qe){
        //     System.out.println("Out of Bound ");
        // }
    //      catch(Exception e){
    //     System.out.println(e);
    //    }
       //throwable is collection of error and exception --->>> parent of both error and all exception.......
        catch(Throwable th){
System.out.println("General Exception");

throw th;
        }
      finally{
        System.out.println("Final Block ");
      }
    }
}
