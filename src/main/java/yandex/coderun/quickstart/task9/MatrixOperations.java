package yandex.coderun.quickstart.task9;

import static yandex.coderun.quickstart.task9.Matrix.printMatrix;
import static yandex.coderun.quickstart.task9.Matrix.printMatrixLite;

public class MatrixOperations {
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
        System.out.println("\n-------------------");
        printMatrixLite(transposedMatrix(m3));
    }

    static int[][] transposedMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
  }
