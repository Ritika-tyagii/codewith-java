// class Employee{
//     void calculateSalary(){
//         System.out.println("Calculating  Employee salary ");
//     }
// } class Manager extends Employee{
//     void calculateSalary(){
//         System.out.println("Calculating Manager salary with bonus");
//     }
// }
// public class MethordOverriding2 {
//     public static void main(String[] args) {
//         Employee e = new Employee();
//         e.calculateSalary(); 

//         Manager m = new Manager();
//         m.calculateSalary(); 

//         Employee emp = new Manager();
//         emp.calculateSalary();
    
//     }
// }
import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double baseSalary;


    public Employee(int employeeId, String employeeName, double baseSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
    }


    public void calculateSalary() {
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Manager extends Employee {
    
    public Manager(int employeeId, String employeeName, double baseSalary) {
        super(employeeId, employeeName, baseSalary);
    }


    @Override
    public void calculateSalary() {
        double finalSalary = baseSalary + (baseSalary * 0.20);
        displayDetails("Manager", finalSalary);
    }

    private void displayDetails(String role, double finalSalary) {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Role: " + role);
        System.out.println("Final Salary: ₹" + finalSalary);
    }
}


class Developer extends Employee {

    public Developer(int employeeId, String employeeName, double baseSalary) {
        super(employeeId, employeeName, baseSalary);
    }

    @Override
    public void calculateSalary() {
        double finalSalary = baseSalary + 8000;
        displayDetails("Developer", finalSalary);
    }

    private void displayDetails(String role, double finalSalary) {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Role: " + role);
        System.out.println("Final Salary:" + finalSalary);
    }
}

public class    MethodOverriding2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Base Salary: ");
        double baseSalary = sc.nextDouble();

        System.out.print("Is the employee a Manager or a Developer? (Enter M/D): ");
        char choice = sc.next().toUpperCase().charAt(0);

        Employee emp = new Employee(id, name, baseSalary);

        if (choice == 'M') {
            emp = new Manager(id, name, baseSalary);
        } else if (choice == 'D') {
            emp = new Developer(id, name, baseSalary);
        } else {
            System.out.println("Invalid choice! Defaulting to base Employee profile.");
            emp = new Employee(id, name, baseSalary);
        }

        emp.calculateSalary();

        sc.close();
    }
}
