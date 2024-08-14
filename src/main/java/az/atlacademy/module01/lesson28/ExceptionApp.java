package az.atlacademy.module01.lesson28;

import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        try {
            Integer.parseInt(word);
        } catch (NumberFormatException ex) {
           throw new RuntimeException();
        }
        System.out.println("111");

    }

}
