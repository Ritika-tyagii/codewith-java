import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: "); 
String name=sc.nextLine();
System.out.print("Enter your age: ");
int age=sc.nextInt();
sc.nextLine(); 
System.out.print("Where you you live? ");
String address=sc.nextLine();
System.out.println("Good Morning!!\nMy name is "+name+".\n"+" I am "+age+" years old.\n"+"I live in "+ address);   
sc.close();
 }
}
