public class Practice {
    public static void main(String[] args) {
 //Find no of  even and odd values...........................................
        /*int ary [][]={
             {10, 21, 30},
            {40, 50, 60},
            {71, 80, 90}
        };
        int even =0;
        int odd=0;
        for( int i=0; i<ary.length; i++){
            for( int j=0; j<ary[0].length; j++){

if(ary[i][j]%2==0){

 even++;}
else{
odd++;
}
            }
        }
System.out.println(even);
System.out.println(odd);
        
*/




//...............................................................................

int ary [][]={
             {10, 21, 30},
            {40, 50, 60},
            {71, 80, 90}
        };

int rowsum=0;
int colsum=0;
for(int i=0; i<ary.length; i++){
    for(int j=0; j<ary[0].length; j++)
    rowsum+=ary[i][j];
System.out.println( "sum of " +(i+1) +"row= "+rowsum);
}

for(int j=0; j<ary[0].length; j++){
    for(int i=0; i<ary.length; i++)
    colsum+=ary[i][j];
System.out.println( "sum of " +(j+1) +"col= "+colsum);
}

    }
}
