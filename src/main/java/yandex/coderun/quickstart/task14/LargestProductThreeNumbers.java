package yandex.coderun.quickstart.task14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/largest-product-three-numbers">task link</a><br>
 * test - OK
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
        if (nums.length <= 5) {
            return bruteThreeLargestNumbers(nums);
        }
        int min0 = Integer.MAX_VALUE, min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min1 > nums[i]) {
                if (min0 > nums[i]) {
                    min1 = min0;
                    min0 = nums[i];
                } else {
                    min1 = nums[i];
                }
            }
            if (max3 < nums[i]) {
                if (max2 < nums[i]) {
                    if (max1 < nums[i]) {
                        max3 = max2;
                        max2 = max1;
                        max1 = nums[i];
                    } else {
                        max3 = max2;
                        max2 = nums[i];
                    }
                } else {
                    max3 = nums[i];
                }
            }
        }
        int[] numsFive = new int[]{min0, min1, max3, max2, max1};
        return bruteThreeLargestNumbers(numsFive);
    }

    /**
     * В соло выдает ошибку TL на 37 тесте
     */
    static String bruteThreeLargestNumbers(int[] nums) {
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

    static String threeLargestNumbersWithSort(int[] nums) {
        if (nums.length <= 5) {
            return bruteThreeLargestNumbers(nums);
        }
        Arrays.sort(nums);
        int[] numsFive = new int[]
                {nums[0], nums[1], nums[nums.length - 1], nums[nums.length - 2], nums[nums.length - 3]};
        return bruteThreeLargestNumbers(numsFive);
    }
}
