public class ArrayForEach {
    public static void main(String[] args) {
        int marks []={2,4,1,8,3};
        //Swapping in Array.............
for( int i=0; i<marks.length;i++){
for(int j=i+1; j<marks.length; j++){
    if (marks[i]>marks[j]){
          int temp= marks[i];
        marks[i]=marks[j];
         marks[j]= temp;

    }
}
}

for( int element: marks){
        System.out.println(element+ " ");
    }
    }
}
