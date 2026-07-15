import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] fruits = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.next();
        }

        System.out.println("Reverse array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fruits[i] + " ");
        }
    }
}
