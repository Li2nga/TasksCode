package yandex.coderun.quickstart.task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CalculateTagsWithoutArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        writer.write(String.valueOf(calculateTags(n)));

        reader.close();
        writer.close();
    }

    static long calculateTags(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int i1 = 1;
        int i2 = 1;
        int sum = 2;
        for (int i = 3; i <= n; i++) {
            int i3 = i1 + i2;
            sum += i3;
            i1 = i2;
            i2 = i3;
        }
        return sum;
    }
}
