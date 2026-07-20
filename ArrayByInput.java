import java.util.Scanner;
public class ArrayByInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array= ");
          int size= sc.nextInt();
          
        System.out.println("Enter the values ");
        int  marks[]=new int[size];
        

        for(int i=0; i<size; i++){
      marks[i]=sc.nextInt();
    }
     for(int i=0; i<size; i++){
    System.out.print(marks[i]+" ");
  }
}
}