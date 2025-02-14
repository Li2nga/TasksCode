package yandex.coderun.quickstart.task13;
//TODO  Вернуться после 14.03. Решить задачу действиями с исходным массивом.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/symmetric-sequence">task link</a><br>
 * test -
 */
public class SymmetricSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int[] nums = new int[n];
        String[] line = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }

        StringBuilder builder = new StringBuilder();
        int ans = numberAddedNumbers(nums);
        builder.append(ans).append("\n");
        for (int i = ans - 1; i >= 0; i--) {
            builder.append(nums[i]).append(" ");
        }

        writer.write(builder.toString());

        reader.close();
        writer.close();
    }

    static boolean isPalindrome(int[] nums) {
        for (int l = 0, r = nums.length - 1; l < r; l++, r--) {
            if (nums[l] != nums[r]) {
                return false;
            }
        }
        return true;
    }

    static int numberAddedNumbers(int[] nums) {
        int indexStartSym = -1;
        for (int i = 0; i < nums.length; i++) {
            int[] newNums = Arrays.copyOfRange(nums, i, nums.length);
            if (isPalindrome(newNums)) {
                indexStartSym = i;
                break;
            }
        }
        return indexStartSym;
    }
}
