package az.atlacademy.lesson35;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinarySearchApp {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(12, 14, 17, 23, 25, 32, 44, 55, 56, 67, 68, 70, 79, 81, 85, 86, 90, 100);
        int size = nums.size();
        System.out.println(size);
        Collections.sort(nums);
        Optional<Integer> num = findNum(nums, 56);
        System.out.println(num);


      // List<Integer> list = new Random().ints(50, 0, 100)
      //         .boxed()
      //         .toList();
    }

    public static Optional<Integer> findNum(List<Integer> nums, int num) {
        int size = nums.size();
        int start = 0;
        int end = size - 1;
        int counter = 0;
        while (start <= end) {
            counter++;
            int mid = (start + end) / 2;
            if (num > nums.get(mid)) {
                start = mid + 1;
            } else if (num < nums.get(mid)) {
                end = mid - 1;
            } else {
                System.out.println(counter);
                return Optional.of(mid + 1);
            }
        }
        System.out.println(counter);
        return Optional.of(-(start + 1));
    }

}
