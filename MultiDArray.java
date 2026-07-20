public class MultiDArray {
    public static void main(String[] args) {
       /* int arr[][]= new int[2][3];
arr[0][0]=10;
arr[0][1]=20;
arr[0][2]=2;


arr[1][0]=20;
arr[1][1]=30;
arr[1][2]=10;


System.out.println(arr[1][2]);
*/
/*
int ary[][]=
{
{10,20,30},
{1,2,3},
{12,23,34}
    };


    for(int i=0; i<ary.length; i++){
        for(int j=0; j<ary.length; j++){
            System.out.print(ary[i][j]+ " ");
        }
    }
    System.out.println();
    */


//Addition of 2D Array........................................................................
    int ary1[][]=
{
{10,20,30},
{1,2,3},
{12,23,34}
    };


    int ary2[][]=
{
{1,2,3},
{10,20,30},
{11,22,21}
};
int sum[][]=new int[3][3];
for(int i=0; i<ary1.length; i++){
    for(int j=0; j<ary2.length;j++ ){
sum[i][j]=ary1[i][j]+ary2[i][j];
    }
}
for(int i=0; i<sum.length; i++){
    for(int j=0; j<sum.length;j++ ){
System.out.print(sum[i][j]+ " ");
    }
    System.out.println();
}
    }}