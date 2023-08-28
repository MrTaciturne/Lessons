public class ApplicationOne {

    public static void main(String[] args) {

        int number = -123;
        int ostatok = number % 10;

        if (ostatok == 3 || ostatok == -3) {
            System.out.println("Последняя цифра числа 3");
        } else {
            System.out.println("Последняя цифра числа не 3");
        }

        // рубль

        int ruble = -102;

        int mod10 = ruble % 10;
        int mod100 = ruble % 100;
        System.out.println("mod100 = " + mod100);


        if (ruble < 0){
            mod10 = mod10 * -1;
            mod100 = mod100 * -1;
        }

        if (mod10 == 0 || mod10 >= 5 || (mod100 <= 19 && mod100 >= 11)){
            System.out.println(ruble + " рублей");
        } else if (mod10 >= 2 && mod10 <= 4) {
            System.out.println(ruble + " рубля");
        } else {
            System.out.println(ruble + " рубль");
        }

        // Вырвать число

        int chislo = 54621;
        int kol = 3;
        int result = (int) (chislo / Math.pow(10, kol - 1)) % 10;
        System.out.println(result);

    }
}
