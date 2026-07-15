import java.util.Scanner;

public class SumOfElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//Sum of all elements of an array.............
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter  elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }sc.close();
        System.out.println("Sum of all elements of  an Array= " + sum);



    }
}