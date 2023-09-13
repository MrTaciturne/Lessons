package Lesson11;


import java.sql.SQLOutput;

public class ThreadRunner {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("puk");

        new Thread(new MyRunnable()).start();
        new Thread(() -> System.out.println("Hello from lambda " + Thread.currentThread().getName())).start();

    }
}
