package az.atlacademy.module01.lesson19;

import java.util.Random;
import java.util.Scanner;

public class ExampleApp {

    public static void main(String[] args) {
        //System.out.printf("%.2f", new Scanner(System.in).nextDouble());
        //int[] nums = new int[6];

        double random = Math.random();

        Random random1 = new Random();
        System.out.println(random1.nextInt(6,10));

        System.out.println(random);
        Scanner sc = new Scanner(System.in);
        double[] doubles = new double[5];
      // doubles[1] = 99.8;
      // doubles[2] = 99.7;
      // doubles[3] = 99.6;
      // doubles[4] = 99.5;

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = sc.nextDouble();
        }

        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i] + " ");
        }

        double[] doubles1 = new double[] {99.9, 99.7, 99.1};

        double[] doubles2 =  {99.9, 99.7, 99.1};

    }

}
