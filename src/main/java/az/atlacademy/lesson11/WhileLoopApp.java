package az.atlacademy.lesson11;

public class WhileLoopApp {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.print("*");
        }

        System.out.println("\n==============");

        int i = -1;
        while (i > 0) {
            System.out.println(i);
        }

        do {
            System.out.println(i);
        } while (i > 0);

    }

}
