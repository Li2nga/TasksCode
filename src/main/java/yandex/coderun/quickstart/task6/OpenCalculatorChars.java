package yandex.coderun.quickstart.task6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/open-calculator">task link</a><br>
 * test - OK
 */
public class OpenCalculatorChars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String nums = reader.readLine();
        char x = nums.charAt(0);
        char y = nums.charAt(2);
        char z = nums.charAt(4);
        String n = reader.readLine();

        writer.write(String.valueOf(countNewFigures(x, y, z, n)));

        reader.close();
        writer.close();
    }

    static int countNewFigures(char x, char y, char z, String n) {
        Set<Character> set = new HashSet<>(List.of(x, y, z));
        for (int i = 0; i < n.length(); i++) {
            set.add(n.charAt(i));
        }
        return set.size() - 3;
    }
}
