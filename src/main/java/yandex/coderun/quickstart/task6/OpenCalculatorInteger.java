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
public class OpenCalculatorInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = reader.readLine().split(" ");
        int x = Integer.parseInt(nums[0]);
        int y = Integer.parseInt(nums[1]);
        int z = Integer.parseInt(nums[2]);
        int n = Integer.parseInt(reader.readLine());

        writer.write(String.valueOf(countNewFigures(x, y, z, n)));

        reader.close();
        writer.close();
    }

    static int countNewFigures(int x, int y, int z, int n) {
        Set<Integer> set = new HashSet<>(List.of(x, y, z));
        do {
            int digit = n % 10;
            n /= 10;
            set.add(digit);
        } while (n > 0);
        return set.size() - 3;
    }
}
