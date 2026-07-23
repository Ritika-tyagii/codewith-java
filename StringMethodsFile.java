public class StringMethodsFile {
    public static void main(String[] args) {
        String s1=new String("Hello");
                String s2=new String("World");

                 
               System.out.println(s1.length());//5
               System.out.println(s1.isEmpty()); //False
                  System.out.println(s1.isBlank());//False

                    String s3=new String(" ");
                    System.out.println("s3  "+s3.length());// 1
                    System.out.println(s3.isEmpty()); //False .......... count space
                    System.out.println(s3.isBlank());//True .............it does not count space
//Character access

System.out.println(s1.charAt(2));//l
//char [] arr=s1.toCharArray();//{'H','e','l','l','o'}

System.out.println("Comparison.................");
String st1= new String("Java");
String st2= new String("JAVA");
System.out.println(st1==st2);//false
System.out.println(st1.equals(st2));//false
System.out.println(st1.equalsIgnoreCase(st2));//true
System.out.println(st1.compareTo(st2));//interger value=32


 
System.out.println("Transformation..............");
System.out.println(".............");
String str1= new String("Adityaa, riya,Priya");
 String [] arr= str1.split("ya");
System.out.println(str1);
for(String s: arr){
    System.out.println(s);
}
  System.out.println(s1.toLowerCase());//hello
                System.out.println(s1.toUpperCase());//HELLO


    }
}
