package Multithreading;

public class MatrixTaskUsingThread {
    public static void main(String[] args) {
        MatrixTask m = new MatrixTask();
        Thread thread = new Thread(m);
        thread.start();
    }
}

class MatrixTask implements Runnable {
    public void run() {
        int[][] matrix1 = {
                {10, 20, 30, 40},
                {5, 15, 25, 35},
                {2, 4, 6, 8},
                {100, 200, 300, 4},
        };
        int[] rowSums = new int[4];

        // Calculate the sum for each row
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += matrix1[i][j];
            }
            rowSums[i] = sum;
        }

        System.out.println("Resultant Matrix Row Sums: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of row " + i + ": " + rowSums[i]);
        }
    }
}
