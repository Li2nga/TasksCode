package yandex.coderun.quickstart.task7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/number-words-text">task link</a><br>
 * test - OK
 */
public class numberWordTextWithoutMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputLine;
        Set<String> words = new HashSet<>();
        while ((inputLine = reader.readLine()) != null && !inputLine.isEmpty()) {
            words.addAll(List.of((inputLine.split(" "))));
        }

        writer.write(String.valueOf(words.size()));

        reader.close();
        writer.close();
    }
}
