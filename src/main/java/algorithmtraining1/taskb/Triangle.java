package algorithmtraining1.taskb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <a href="https://contest.yandex.ru/contest/27393/problems/B/">task link</a><br>
 * test - OK
 */
public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        writer.write(isTriangle(a, b, c));

        reader.close();
        writer.close();
    }

    static String isTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            return "YES";
        }
        return "NO";
    }
}
