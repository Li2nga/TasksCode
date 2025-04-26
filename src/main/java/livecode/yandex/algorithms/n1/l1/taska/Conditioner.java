package livecode.yandex.algorithms.n1.l1.taska;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <a href="https://contest.yandex.ru/contest/27393/problems/A/>task link</a><br>
 * test - OK
 */
public class Conditioner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = reader.readLine().split(" ");
        int tRoom = Integer.parseInt(nums[0]);
        int tCond = Integer.parseInt(nums[1]);
        String mode = reader.readLine();

        writer.write(String.valueOf(calcTemp(tRoom, tCond, mode)));

        reader.close();
        writer.close();
    }

    static int calcTemp(int tRoom, int tCond, String mode) {
        int r = 0;
        if ((mode.equals("freeze") || mode.equals("auto")) && tRoom > tCond) {
            r = tCond;
        } else if ((mode.equals("heat") || mode.equals("auto")) && tRoom < tCond) {
            r = tCond;
        } else {
            r = tRoom;
        }
        return r;
    }
}
