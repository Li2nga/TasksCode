package yandex.coderun.quickstart.task9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

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

        printMatrixLite(A);
        printMatrixLite(B);
        printMatrixLite(multiplicationMatrix(A, B));

        reader.close();
        writer.close();
    }

    public static void printMatrixLite(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
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
}
