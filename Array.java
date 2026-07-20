import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Array{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of array");
        int l=input.nextInt();
        int myarray [];

        System.out.println("Enter values");
        for(int i=0;i<l;i++){
            myArray[i]=input.nextInt();
        }
    }System.out.println(myArray)
}