package Lesson11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPools {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Executors.newSingleThreadExecutor();

        Executors.newScheduledThreadPool(5); // через какое-то время
        Executors.newWorkStealingPool(); // по колличеству ядер процессора

        executorService.execute(() -> System.out.println("Hello")); // заставить выполнять задачу
        Future<Integer> submit = executorService.submit(() -> 2); // возврат напрямую значения :: ждёт возврата (!многопоточность без фьючер)
        submit.get(); // становится стопером

        executorService.shutdown(); // закрытие пула
    }
}
