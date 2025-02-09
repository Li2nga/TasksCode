package yandex.coderun.quickstart.task11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://coderun.yandex.ru/selections/quickstart/problems/dictionary-synonyms">task link</a><br>
 * test - OK
 */
public class DictionarySynonyms {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            String a = line[0];
            String b = line[1];
            map.put(a, b);
            map.put(b, a);
        }
        String input = reader.readLine();
        String output = map.get(input);

        writer.write(output);

        reader.close();
        writer.close();
    }
}
