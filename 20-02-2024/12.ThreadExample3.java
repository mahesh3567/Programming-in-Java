public class ThreadExample3 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Creating and starting threads T1 and T2
        MatrixThread t1 = new MatrixThread("T1", matrix1);
        MatrixThread t2 = new MatrixThread("T2", matrix2);

        // Starting threads T1 and T2
        t1.start();
        t2.start();

        try {
            // Waiting for threads T1 and T2 to complete
            t1.join();
            t2.join();

            // Creating and starting threads T3
            MatrixAdditionThread t3 = new MatrixAdditionThread("T3", t1.getMatrix(), t2.getMatrix());
            t3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MatrixThread extends Thread {
    private final int[][] matrix;
    
    MatrixThread(String name, int[][] matrix) {
        super(name);
        this.matrix = matrix;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": STARTED");
        System.out.println(getName() + ": Matrix content:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(getName() + ": COMPLETED");
    }

    public int[][] getMatrix() {
        return matrix;
    }
}

class MatrixAdditionThread extends Thread {
    private final int[][] matrix1;
    private final int[][] matrix2;

    MatrixAdditionThread(String name, int[][] matrix1, int[][] matrix2) {
        super(name);
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": STARTED");
        System.out.println(getName() + ": Matrix addition result:");
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(getName() + ": COMPLETED");
    }
}
