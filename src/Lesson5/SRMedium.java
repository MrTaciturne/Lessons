package Lesson5;

import java.util.Scanner;

public class SRMedium {

    public static void main(String[] args) {

        String name;
        String patronymic;
        String surname;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your full name");
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("Familia: ");
        patronymic = in.nextLine();
        System.out.print("Otchestvo: ");
        surname = in.nextLine();

        System.out.println(String.format("%s.%s.%s.", toUp(patronymic), toUp(name), toUp(surname)));

    }

    public static char toUp (String word){
        word = word.toUpperCase();
        return word.charAt(0);
    }
}
