package yandex.coderun.quickstart.task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/calculate-tags">task link</a><br>
 * test - OK
 */
public class CalculateTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        long t = Arrays.stream(createArray(n)).sum();

        writer.write(String.valueOf(t));

        reader.close();
        writer.close();
    }

    static long[] createArray(int n) {
        long[] nums = new long[n];
        nums[0] = 1;
        if (n == 1) {
            return nums;
        }
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums;
    }
}
/*
x1 x2 x3 x4 x5 x6

1 1 2 3 5 8
 */
