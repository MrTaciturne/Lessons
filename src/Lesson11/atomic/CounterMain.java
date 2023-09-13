package Lesson11.atomic;

import Lesson11.MyRunnable;

public class CounterMain {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
//        counterTread(counter, 4);

        Thread counterTread1 = new CounterThread(counter);
        Thread counterTread2 = new CounterThread(counter);
        Thread counterTread3 = new CounterThread(counter);
        Thread counterTread4 = new CounterThread(counter);

        counterTread1.start();
        counterTread2.start();
        counterTread3.start();
        counterTread4.start();

        counterTread1.join();
        counterTread2.join();
        counterTread3.join();
        counterTread4.join();

        System.out.println(counter.getCount());
    }

//    private static void counterTread(Counter counter, int i) {
//        for (int j = i; j > 0 ; j--) {
//            new Thread(new CounterThread(counter)).start();
//        }
//    }
}
