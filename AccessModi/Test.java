package AccessModi;
import AccessModifier.StudentAccess;
public class Test {

    public static void main(String[] args) {
        StudentAccess sc= new StudentAccess();
        sc.name="Ritika";
        sc.age=12;
        System.out.println("Public Access Modifier");
        System.out.println(sc.name);
        sc.hello();
    }
}