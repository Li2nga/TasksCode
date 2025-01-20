package yandex.coderun.quickstart.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SeasonTasks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = reader.readLine();

        String[] sArray = s.split(" ");

        long a = Long.parseLong(sArray[0]);
        long b = Long.parseLong(sArray[1]);

        long sum = a + b;
        writer.write(String.valueOf(sum));

        reader.close();
        writer.close();
    }
}
