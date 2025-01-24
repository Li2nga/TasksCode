package yandex.coderun.quickstart.task5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/quadratic-equation">task link</a><br>
 * test - OK
 */
public class QuadraticEquation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = reader.readLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);

        writer.write(solveQuadraticEquation(a, b, c));

        reader.close();
        writer.close();
    }

    static String solveQuadraticEquation(int a, int b, int c) {
        StringBuilder out = new StringBuilder();
        int d = b * b - 4 * a * c;
        if (d < 0) {
            out.append('0');
            return out.toString();
        }
        if (d == 0) {
            double x = -((double) b / (2 * a));

            out.append('1').append('\n');
            out.append(x);
            return out.toString();
        }
        double x1 = ((-(double) b + Math.sqrt(d)) / (2 * a));
        double x2 = ((-(double) b - Math.sqrt(d)) / (2 * a));
        out.append('2').append('\n');
        if (x1 < x2) {
            out.append(x1).append(' ').append(x2);
        } else {
            out.append(x2).append(' ').append(x1);
        }
        return out.toString();
    }
}
