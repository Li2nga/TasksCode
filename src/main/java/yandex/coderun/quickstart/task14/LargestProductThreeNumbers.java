package yandex.coderun.quickstart.task14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/largest-product-three-numbers">task link</a><br>
 */
public class LargestProductThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        writer.write(threeLargestNumbers(nums));

        reader.close();
        writer.close();
    }

    static String threeLargestNumbers(int[] nums) {
        long maxMult = Long.MIN_VALUE;
        int ans1 = 0, ans2 = 0, ans3 = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int temp1 = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int temp2 = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int temp3 = nums[k];
                    if ((long) temp1 * temp2 * temp3 > maxMult) {
                        maxMult = (long) temp1 * temp2 * temp3;
                        ans1 = temp1;
                        ans2 = temp2;
                        ans3 = temp3;
                    }
                }
            }
        }
        return ans1 + " " + ans2 + " " + ans3;
    }
}
