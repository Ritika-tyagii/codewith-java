public class ArrayTranspose {
    public static void main(String[] args) {
        int ary1[][]=
{
{10,20,30},
{1,2,3},
{12,23,34}
    };
    int row=ary1.length;
    int cols=ary1[0].length;
int array [][]=new int [cols][row];

    for( int i=0; i<row; i++){
        for(int j=0; j<cols;j++){
            array [j][i]=ary1[i][j];
        }
    }
System.out.println("Transpose");
 for( int i=0; i<array.length; i++){
        for(int j=0; j<array[i].length;j++){
            System.out.print(array[i][j]+ " ");
        }
 System.out.println();
    }

    }
}

