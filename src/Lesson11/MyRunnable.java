package Lesson11;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from Runnable " + Thread.currentThread().getName());
    }
}
