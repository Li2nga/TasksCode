package yandex.coderun.quickstart.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/triangle">task link</a><br>
 * test - OK
 */
public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        String out = isTriangle(a, b, c) ? "YES" : "NO";

        writer.write(out);
        reader.close();
        writer.close();
    }

    static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
