package az.atlacademy.module01.lesson51;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamApp {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 45, 54, 123, 90, 60, 100);

        for (int i = 1; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }


    //  list.stream()
    //          .filter(new Predicate<Integer>() {
    //              @Override
    //              public boolean test(Integer integer) {
    //                  return integer % 2 == 0;
    //              }
    //          }).map(new Function<Integer, String>() {
    //              @Override
    //              public String apply(Integer integer) {
    //                  return integer + " ";
    //              }
    //          }).forEach(new Consumer<String>() {
    //              @Override
    //              public void accept(String s) {
    //                  System.out.println(s);
    //              }
    //          });
    //

        list.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer + " ")
                .forEach(System.out::println);

    }

}
