package Lesson11.atomic;

public class CounterThread extends Thread{

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            counter.increment();
        }
    }
}
