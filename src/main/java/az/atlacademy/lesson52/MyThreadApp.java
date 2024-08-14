package az.atlacademy.lesson52;

public class MyThreadApp {

    public static void main(String[] args) {
        MyCustomThread myCustomThread = new MyCustomThread();
        int priority1 = myCustomThread.getPriority();

        myCustomThread.start();
        //System.out.println("1" + priority1);

        MyCustomThread myCustomThread1 = new MyCustomThread();
        int priority2 = myCustomThread1.getPriority();

        myCustomThread1.start();
        //System.out.println("2" + priority2);

    }

}
