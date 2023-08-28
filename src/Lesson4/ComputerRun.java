package Lesson4;

public class ComputerRun {

    public static void main(String[] args) {
        Computer asus = new Computer(32,54);
        Computer asus2 = new Computer();
        asus.load();
        System.out.println(asus.getSsd());
    }
}
