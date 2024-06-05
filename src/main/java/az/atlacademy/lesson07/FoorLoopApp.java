package az.atlacademy.lesson07;

import java.util.Scanner;

public class FoorLoopApp {

    public static void main(String[] args) {
        //int num = 5;
        //System.out.println(num++);
        //System.out.println(num);

       //System.out.println("Hello World!");

       //for (int i = 0; i < 5; i++) {
       //    System.out.println("Hello World!");
       //}

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("******");
        }

    }

}
