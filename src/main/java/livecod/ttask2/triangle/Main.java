package livecod.ttask2.triangle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        writer.write(TR(a, b, c));
        reader.close();
        writer.close();
    }

    static String TR(int a, int b, int c) {
        if (a + b > c && b + c > a && c + a > b) {
            return "YES";
        }
        return "NO";
    }
}
