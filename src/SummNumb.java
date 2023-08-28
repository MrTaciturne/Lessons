import java.util.Scanner;

public class SummNumb {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int summ = 0;

        for (int curNumber = number; curNumber != 0; curNumber /= 10) {
            summ += curNumber % 10;
        }

        if (summ < 0) {
            summ *= -1;
        }
        System.out.print("Сумма цифр = " + summ + """
                
                Введите число для факториала =""" + " ");

        number = in.nextInt();
        int fact = 1;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                fact *= i;
                if (i == number){
                    System.out.println("Factorial = " + fact);
                }
            }
        } else {
            System.out.println("Число некоректно");
        }
    }
}
