package az.atlacademy.lesson29;

import java.util.Random;

public class GenericApp {

    public static void main(String[] args) {
        Box<Integer> integerBox = generateRandom();
        System.out.println(integerBox);

    }

    public static Box<Integer> generateRandom() {
        int num = (int) (Math.random() * 100);
        boolean isEven = num % 2 == 0;
        return new Box<>(num, isEven);
    }

}
