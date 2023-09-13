package Lesson11.atomic;

public class Counter {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void increment (){
        count++;
    }
//    Or
//    synchronized (this) {
//        count++;
//}

    public void decrement(){
        count--;
    }
}
