package az.atlacademy.lesson39;

import java.util.Arrays;
import java.util.List;

public class StringBuilderApp {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "programming");
        String delimiter = "-";

        String result = concatenateAndCapitalize(words, delimiter);
        System.out.println(result);  // Output: "Hello-World-Java-Programming"
        String s = words.get(1).substring(0, 1).toUpperCase();
        System.out.println(s);
    }

    public static String concatenateAndCapitalize(List<String> words, String delimiter) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            sb.append(capitalizedWord);

            if (i < words.size() - 1) {
                sb.append(delimiter);
            }
        }

        return sb.toString();
    }

}



