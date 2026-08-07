class Employee{
    void calculateSalary(){
        System.out.println("Calculating  Employee salary ");
    }
} class Manager extends Employee{
    void calculateSalary(){
        System.out.println("Calculating Manager salary with bonus");
    }
}
public class MethordOverriding {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.calculateSalary(); 

        Manager m = new Manager();
        m.calculateSalary(); 

        Employee emp = new Manager();
        emp.calculateSalary();
    }
}
