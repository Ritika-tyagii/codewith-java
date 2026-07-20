public class Lab3Matrix {
    public static void main(String[] args) {

        int[][] matrix = 
        {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int n = matrix.length;
        System.out.print("Primary diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + ", ");
        }
        System.out.println();

        System.out.print("Secondary diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + ", ");
        }
        System.out.println();

    
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        System.out.println("Even numbers count = " + evenCount);
        System.out.println("Odd numbers count = " + oddCount);
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum = " + rowSum);
        }


        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum = " + colSum);
        }
    }
}
