package yandex.coderun.quickstart.task15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/largest-product-three-numbers">task link</a><br>
 */
public class DetermineTypeSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> nums = new ArrayList<>();
        int num;
        while ((num = Integer.parseInt(reader.readLine())) != -2_000_000_000) {
            nums.add(num);
        }

        writer.write(determineTypeSequence(nums));

        reader.close();
        writer.close();
    }

    static String determineTypeSequence(List<Integer> nums) {
        boolean ascending = true;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) >= nums.get(i)) {
                ascending = false;
            }
        }
        if (ascending) {
            return "ASCENDING";
        }
        return "RANDOM";
    }
}

/*
-530
-530
-530
-530
-530
-530
-2000000000
 */
