public class ProgramArray {
    public static void main(String[] args) {
//array by user defined values
      /* int [] myArrayy = new int[4]; 
  myArrayy[1] =2;
    myArrayy[2] =2;
      myArrayy[3] =2;*/
 
 int myArrayy [] = {2,4,5,2,7,5,9,3,2,1};
  int marks [] = {92,54,25,2,17,5,9,3};
/*System.out.println(myArrayy[1]);
System.out.println(myArrayy[2]);
System.out.println(myArrayy[3]);*/
/*int index=0;
while(index<myArrayy.length){
    System.out.println(myArrayy[index]);
    index++;
}*/

System.out.println(myArrayy.length);
int i=0;

for(i=0;i<myArrayy.length;i++){//Display array travesal
System.out.println(myArrayy[i]);}

System.out.println("Display Elements in Reverse Order");
for(int j=marks.length-1;j>=0;j--){
    System.out.print(marks[j]);
    System.out.print(" ");
}
}
    }
