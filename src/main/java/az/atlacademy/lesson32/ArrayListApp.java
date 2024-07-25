package az.atlacademy.lesson32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListApp {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            nums.add((int) (Math.random() * 100));
        }
          
        System.out.println(nums);

        int secondLargest = findSecondLargest(nums);
        System.out.println(secondLargest);
    }

    public static int findSecondLargest(ArrayList<Integer> numbers) {
        numbers.sort((o1, o2) -> Integer.compare(o2, o1));
        return numbers.get(1);
    }

}
