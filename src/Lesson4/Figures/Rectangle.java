package Lesson4.Figures;

import java.sql.SQLOutput;

public class Rectangle extends Figures {

    public Rectangle(int hight, int lenght) {
        super(hight, lenght);
    }

    public void perimetr () {
        System.out.println("Perimetr = " + ((getHight() + getLenght()) * 2));
    }

    public void ploshad () {
        System.out.println("Ploshad = " + (getHight() * getLenght()));
    }

}
