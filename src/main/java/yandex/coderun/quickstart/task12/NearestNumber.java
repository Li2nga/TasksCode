package yandex.coderun.quickstart.task12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/nearest-number">task link</a><br>
 * test - OK
 */
public class NearestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int[] nums = new int[n];
        String[] line = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        int x = Integer.parseInt(reader.readLine());

        writer.write(String.valueOf(nearestNumber(nums, x)));

        reader.close();
        writer.close();
    }

    public static int nearestNumber(int[] nums, int x) {
        int out = nums[0];
        int d = Math.abs(x - out);
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(x - nums[i]) < d) {
                d = Math.abs(x - nums[i]);
                out = nums[i];
            }
        }
        return out;
    }
}
