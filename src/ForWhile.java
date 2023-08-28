import java.util.Scanner;

public class ForWhile {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("First number = ");
        int first = in.nextInt();
        System.out.print("Second number = ");
        int second = in.nextInt();
        int n,m,summ = 0;

        if (first > second) {
            m = first;
            n = second;
        } else {
            m = second;
            n = first;
        }

        while (m != n - 1) {
            summ = summ + m;
            System.out.println(m + " in square = " + m * m);
            m--;
        }
        System.out.println("Sum n + m = " + summ);
    }
}
