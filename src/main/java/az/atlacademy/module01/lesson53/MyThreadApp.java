package az.atlacademy.module01.lesson53;

public class MyThreadApp {

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        Thread thread = new Thread(customThread);
        Thread thread2 = new Thread(customThread);
        thread2.setPriority(10);

        thread.start();
        thread2.start();


    }
}
