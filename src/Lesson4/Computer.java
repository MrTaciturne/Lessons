package Lesson4;

public class Computer {

    private int ssd = 128;
    private int ram = 32;

    Computer(){
    }

    public Computer(int newSsd, int newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    public void load() {
        System.out.println("Я загружаюсь");
    }

    public int getSsd() {
        return ssd;
    }
}
