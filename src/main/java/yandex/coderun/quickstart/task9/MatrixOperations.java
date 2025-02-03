package yandex.coderun.quickstart.task9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/matrix-operations">task link</a><br>
 * test - OK
 */
public class MatrixOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = reader.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int k = Integer.parseInt(nums[2]);

        int[][] A = new int[n][m];
        int[][] B = new int[m][k];

        for (int i = 0; i < n; i++) {
            A[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < m; i++) {
            B[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        writer.write(printMatrixLite(transposedMatrix(multiplicationMatrix(A, B))));

        reader.close();
        writer.close();
    }

    public static String printMatrixLite(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sb.append(anInt).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static int[][] multiplicationMatrix(int[][] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        int k = B[0].length;
        int[][] C = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int a = 0; a < m; a++) {
                    C[i][j] += A[i][a] * B[a][j];
                }
            }
        }
        return C;
    }

    static int[][] transposedMatrix(int[][] C) {
        int[][] transposedMatrix = new int[C[0].length][C.length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                transposedMatrix[j][i] = C[i][j];
            }
        }
        return transposedMatrix;
    }
}
