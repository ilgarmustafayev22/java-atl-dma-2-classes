package az.atlacademy.lesson51;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Stream02App {

    public static void main(String[] args) {
        Integer num = new Random()
                .ints(50, 0, 100)
                .boxed()
                .max(Integer::compareTo)
                .get();

        List<Integer> list = Arrays.asList(12, 45, 54, 123, 90, 60, 100);


        Integer search = search(list, 100);
        System.out.println(search);
    }

    public static <E> E search(Collection<E> collection, E data) {
        return collection.stream()
                .filter(element -> element.equals(data))
                .findFirst()
                .orElseThrow(new Supplier<RuntimeException>() {
                    @Override
                    public RuntimeException get() {
                        return new DataNotFoundException("data found this collection "+ data);
                    }
                });
    }


}
