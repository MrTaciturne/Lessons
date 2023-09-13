package Lesson11;

import java.sql.SQLOutput;

public class MyThread extends Thread {  //Не лучший вариант (ограничение по экстендам)
    // Используется разве что для переопредления других методов Tread и создание своего потока особого

    @Override
    public void run() {
        System.out.println("Hello from Thread " + Thread.currentThread().getName());
    }
}
