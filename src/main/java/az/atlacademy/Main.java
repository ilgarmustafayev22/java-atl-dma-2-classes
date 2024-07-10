package az.atlacademy;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //foo(5, 6);

        int sum = foo2(5, 6);
        System.out.println(sum);
    }

    public static void foo(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int foo2(int a, int b) {
        return a + b;
    }

}