package AccessModifier;
 public class PrivateCat {
 
  public static void main(String[] args) {
    Cat1 c1=new Cat1();
    System.out.println(c1.age);
  System.out.println(c1.getName());
  c1.display();
  }
}
 
   class Cat1{
 private String name="riti";
 public int age=10;
 public String getName(){
  return name;
 }
 public void display(){
   System.out.println("private");
   System.out.println(name);
 }
 }
