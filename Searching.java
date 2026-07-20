import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int [] ary={3,4,6,9,92,1,10,38,43,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Array Searching");
        //linear searching...............................
        System.out.print("Enter one Element to search = ");
        int A=sc.nextInt();
        for( int i=0; i<ary.length; i++){
        if (ary[i]==A){
    System.out.println("Element found at index " + i );
    return;
}   
        }
        System.out.println("Element not found ");
}
}


