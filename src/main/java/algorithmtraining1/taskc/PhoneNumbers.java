package algorithmtraining1.taskc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <a href="https://contest.yandex.ru/contest/27393/problems/C/">task link</a><br>
 * test - OK
 */
public class PhoneNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = convNum(Long.parseLong(reader.readLine().replaceAll("\\D", "")));
        long num2 = convNum(Long.parseLong(reader.readLine().replaceAll("\\D", "")));
        long num3 = convNum(Long.parseLong(reader.readLine().replaceAll("\\D", "")));
        long num4 = convNum(Long.parseLong(reader.readLine().replaceAll("\\D", "")));

        writer.write((num == num2 ? "YES" : "NO") + "\n" +
                (num == num3 ? "YES" : "NO") + "\n" +
                (num == num4 ? "YES" : "NO"));

        reader.close();
        writer.close();
    }

    static long convNum(long raw) {
        if (raw < 1_000_00_00) {
            raw += 8_495_000_00_00L;
        } else if (raw < 8_000_000_00_00L) {
            raw += 1_000_000_00_00L;
        }
        return raw;
    }
}
