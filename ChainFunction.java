public class ChainFunction {

/*static int sum(int a,int b){
    hello();
    System.out.println("hello");
   
       return a+b;
  
}
static void demo(){
    System.out.println("hii");

}
static void hello(){
     demo();
    System.out.println("ritika");
   
}*/
    public static void main(String[] args) {
   //     System.out.println(sum(2,4));
   int n=8;
printNum(n);
    }

    static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.println(n+(n-1));


    }
}
