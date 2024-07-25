package az.atlacademy.lesson07;

import java.util.Scanner;

public class ExampleApp {

    public static void main(String[] args) {
        // TODO: 6/4/2024 1) Scannerden input götürürük
        // TODO: 6/4/2024 2) Gelen ededin 0 12 intervalında olduğun yoxlayırıq
        // TODO: 6/4/2024 3) gelen ededi onun nömrəsinə uyğun ayı konsola çap edirik

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("Mai");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("Octaber");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("False operation!!!");
        }

    }
}
