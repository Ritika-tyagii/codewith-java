package OopsConcept;
//Chaining of constructor................................
public class Constructor {
    public static void main(String[] args) {
      
   
        Student s2=new Student("Aman",21);
         Student s3=new Student();
              Student s1=new Student("Riti",20,101);
      System.out.println(s1.name);
       System.out.println(s1.age);
        System.out.println(s1.roll);
 System.out.println(s2.name);
       System.out.println(s2.age);
        System.out.println("Default=" +s2.roll);

    }
}
  class Student{
    String name;
    int age;
    int roll;
 Student(){
    System.out.println("dafault constructor");
}
Student(String name,int age){
    this("rakhi",22,103);
System.out.println("2parameter");
}
Student(String name, int age,int roll){
this.name=name;
this.age=age;
this.roll=roll;
System.out.println("three parameter");
}

  }