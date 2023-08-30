package Lesson4.Figures;

public abstract class Figures {

    private int hight;
    private int lenght;
    private int vertex;

    public Figures(int hight, int lenght, int vertex) {
        this.hight = hight;
        this.lenght = lenght;
        this.vertex = vertex;
    }

    public Figures(int hight, int lenght) {
        this.hight = hight;
        this.lenght = lenght;
    }

    public Figures(int hight) {
        this.hight = hight;
    }



    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

}
