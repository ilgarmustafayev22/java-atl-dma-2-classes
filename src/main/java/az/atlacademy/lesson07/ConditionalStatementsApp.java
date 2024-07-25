package az.atlacademy.lesson07;

import java.util.Scanner;

public class ConditionalStatementsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String s = num % 2 == 0 ? (num == 0 ? "ZERO" : "EVEN") : "ODD";
        System.out.println(s);

        System.out.println("=================");

        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }

}
