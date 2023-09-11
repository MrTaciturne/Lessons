package Lesson10;

public class StringBuilders {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100; i++) {
            str += i;
        }
        long finish = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append(i);
        }

    }
}