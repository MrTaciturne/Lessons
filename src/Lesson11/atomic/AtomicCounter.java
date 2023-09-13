package Lesson11.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger count = new AtomicInteger();

    public int getCount() {
        return count.get();
    }

    public void increment (){
        count.incrementAndGet();
    }

    public void decrement(){
        count.decrementAndGet();
    }
}
