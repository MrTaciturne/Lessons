package Lesson11;

public class MyThreadRunner {

    public static void main(String[] args) {

        tread(4);

    }

    private static void tread(int j){
        for (int x = j; x > 0; x--) {
            new Thread(() -> {
                for (int i = 0; i <= 100; i++) {
                    System.out.println(i + " : " + Thread.currentThread().getName());
                }
            }).start();
        }
    }
}
