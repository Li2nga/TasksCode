package yandex.coderun.quickstart.task9;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][];
        matrix[0] = new int[]{1, 2, 3, 4, 5};
        matrix[1] = new int[]{1, 2, 3, 4, 5};
        matrix[2] = new int[]{7, 5, 5, 4, 3};
        matrix[3] = new int[]{1, 2, 3, 4, 5};
        matrix[4] = new int[]{1, 2, 3, 4, 5};
        int[][] m2 = new int[2][];
        m2[0] = new int[]{1, 2};
        m2[1] = new int[]{1, 2};
        int[][] m3 = new int[5][];
        m3[0] = new int[]{1, 2, 7, 8, 9};
        m3[1] = new int[]{0, 2, 3, 7, 8};
        m3[2] = new int[]{0, 0, 4, 6, 7};
        m3[3] = new int[]{0, 0, 0, 5, 6};
        m3[4] = new int[]{0, 0, 0, 0, 5};
        int[][] m4 = new int[1][];
        m4[0] = new int[]{1, 2, 3, 4, 5};
        int[][] m5 = {{1}, {2}, {3}};

        printMatrix(matrix);
        System.out.println("\n-------------------");
        printMatrix(m2);
        System.out.println("\n-------------------");
        printMatrix(m3);
        System.out.println("\n-------------------");
        printMatrix(m4);
        System.out.println("\n-------------------");
        printMatrix(m5);
        System.out.println("\n-------------------");
        printMatrixLite(m3);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(matrix[i][matrix[i].length - 1]);
            System.out.println();
        }
        for (int j = 0; j < matrix[matrix.length - 1].length - 1; j++) {
            System.out.print(matrix[matrix.length - 1][j] + " ");
        }
        System.out.print(matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1]);
    }

    public static void printMatrixLite(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
