package az.atlacademy.lesson09;

import java.util.Scanner;

public class Task01App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int tam = num / 10;
        int qaliq = num % 10;
        System.out.print(tam + " " + qaliq);
    }

}
