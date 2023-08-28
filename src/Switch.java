import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

//        int month = 12;
//        String result;
//
//        result = switch (month) {
//            case 12, 1, 2 -> "Winter";
//            case 3, 4, 5 -> "Spring";
//            case 6, 7, 8 -> "Summer";
//            case 9, 10, 11 -> "Autumn";
//            default -> "incorrect";
//        };
//        System.out.println(result);

        //Определение из трёх

        byte min, max, middle;

        System.out.print("Введите возраст Борирса: ");
        byte ageB = input.nextByte();
        System.out.print("Введите возраст Ивана: ");
        byte ageI = input.nextByte();
        System.out.print("Введите возраст Анны: ");
        byte ageA = input.nextByte();

        if (ageI < ageB && ageI < ageA) {
            min = ageI;
        } else if (ageI < ageB) {
            middle = ageI;
            max = ageB;
            min = ageA;
        } else if (ageI < ageA) {
            middle = ageI;
            max = ageA;
            min = ageB;
        } else if (ageI > ageB) {

        }


//        if (ageB > ageI || ageB > ageA) {
//            if (ageB > ageI && ageB > ageA) {
//                max = ageB;
//            } else {
//                middle = ageB;
//            }
//        } else {
//            min = ageB;
//        }






    }
}
