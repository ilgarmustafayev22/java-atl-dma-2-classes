package az.atlacademy.lesson52;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApp {

    public static void main(String[] args) {
        String word = "AZERBAIJAN";
        Map<Integer, Integer> collect = word.chars()
                .boxed()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));
        System.out.println(collect);

        Map<Character, Long> collect1 = word.chars()
                .mapToObj(k -> (char) k)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        Map<Integer, Long> collect2 = word.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);

    }

}
