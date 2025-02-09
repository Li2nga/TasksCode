package yandex.coderun.quickstart.task10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/gcd-and-lcm">task link</a><br>
 * test - OK
 */
public class gcdAndLcm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        writer.write(gcd(a, b) + " " + lcm(a, b));

        reader.close();
        writer.close();
    }

    public static int gcd(int a, int b) {
        int b2 = b;
        int a2 = a;
        while (b2 != 0) {
            int temp = b2;
            b2 = a2 % b2;
            a2 = temp;
        }
        return a2;
    }

    public static long lcm(int a, int b) {
        return (long) a / gcd(a, b) * b;
    }
}

/*
НОК - lcm
НОД - gcd
 */
