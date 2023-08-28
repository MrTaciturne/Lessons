package Lesson4;

import java.util.Scanner;

public class Metods {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] massivStatic = {5, 1, 6};
        int[] massivTets = new int[3];

        System.out.println("Введите 3 числа для массива");
        for (int i = 0; i < 3; i++) {
            massivTets[i] = in.nextInt();
        }
        if (minmax(massivStatic, massivTets) == true) {
            System.out.println("Ваш массив не тяжелее");
        } else {
            System.out.println("Ваш массив тяжелее");
        }
    }

    private static boolean minmax(int[] mS, int[] mT) {
        int mSSumm = 0, mTSumm = 0;
        for (int i = 0; i < 3; i++) {
            mSSumm += mS[i];
            mTSumm += mT[i];
        }
        return mSSumm >= mTSumm;
    }

}
