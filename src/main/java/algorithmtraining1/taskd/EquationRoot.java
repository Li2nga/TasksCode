package algorithmtraining1.taskd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <a href="https://contest.yandex.ru/contest/27393/problems/D/">task link</a><br>
 * test - OK
 */
public class EquationRoot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        writer.write(calcEquation(a, b, c));

        reader.close();
        writer.close();
    }
    //sqrt(ax+b)=c
    static String calcEquation(int a, int b, int c) {
        if (c < 0) {
            return "NO SOLUTION";
        }
        if (a == 0) {
            if (b == c * c) {
                return "MANY SOLUTIONS";
            }
            return "NO SOLUTION";
        }
        if ((c * c - b) % a != 0) {
            return "NO SOLUTION";
        }
        return String.valueOf((c * c - b) / a);
    }
}
