package az.atlacademy.lesson52;

public class MyCustomThread extends Thread {

    @Override
    public synchronized void run() {

        synchronized (this) {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(MyCustomThread.currentThread().getName() + i);
                }
            } catch (IllegalThreadStateException e) {
                e.printStackTrace();
            }
        }
    }

}
