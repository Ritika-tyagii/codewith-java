package OopsConcept;


public class ToStringMethod {
    String name;
    int noOfWheel;

public ToStringMethod(String name,int noOfWheel){
    this.name=name;
    this.noOfWheel=noOfWheel;


}
@Override
public String toString() {
    // TODO Auto-generated method stub
    //By defsult it provide classname@hashcode
    return "My car name is"+name;
}

public static void main(String[] args) {
     ToStringMethod st1=new  ToStringMethod("wift",2);
     System.out.println(st1.toString());
}
}
