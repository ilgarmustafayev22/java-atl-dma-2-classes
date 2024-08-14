package az.atlacademy.module01.lesson53;

import az.atlacademy.module01.lesson52.MyCustomThread;

public class CustomThread implements Runnable {

    @Override
    public void run() {
        synchronized (this){
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(MyCustomThread.currentThread().getId());
                }
            } catch (IllegalThreadStateException e) {
                e.printStackTrace();
            }
        }

    }

}
