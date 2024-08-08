package az.atlacademy.lesson50;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalProgrammingApp {

    public static void main(String[] args) {

        Function<String, Integer> function = s -> Integer.parseInt(s);
        Integer apply = function.apply("7");
        System.out.println(apply);

        BiFunction<Integer, Integer, String> biFunction = (integer, integer2) -> integer + " " + integer2;
        String apply1 = biFunction.apply(3, 4);
        System.out.println(apply1);


        Person person = new Person(1L, "A", 22);

        Consumer<Person> consumer = System.out::println;
        consumer.accept(person);

        Predicate<String> predicate = s -> s.length() > 5;

        BiPredicate<String, String> biPredicate = new BiPredicate<>() {
            @Override
            public boolean test(String s, String s2) {
                return s.length() > s2.length();
            }
        };

        BiConsumer<Integer, Integer> biConsumer = new BiConsumer<>() {
            @Override
            public void accept(Integer integer1, Integer integer2) {
                System.out.println(integer1 + integer2);
            }
        };

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.forEach(System.out::println);

    }

}
