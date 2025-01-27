package yandex.coderun.quickstart.task7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/number-words-text">task link</a><br>
 * test - OK
 */
public class numberWordsText {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputLine;
        StringBuilder text = new StringBuilder();
        while ((inputLine = reader.readLine()) != null && !inputLine.isEmpty()) {
            text.append(inputLine).append('\n');
        }
        if (text.isEmpty()) {
            writer.write("0");
        } else {
            text.setLength(text.length() - 1);
            writer.write(String.valueOf(countNumberWords(text.toString())));
        }

        reader.close();
        writer.close();
    }

    static int countNumberWords(String text) {
        String[] wordsArray = text.replace("\n", " ").split(" ");
        Set<String> words = new HashSet<>(Arrays.asList(wordsArray));
        return words.size();
    }
}
