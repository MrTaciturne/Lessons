package Lesson7;

public class Pair<K, V> {

    private K firstElement;
    private V secondElement;

    public Pair(K firstElement, V secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public void setFirstElement(K firstElement) {
        this.firstElement = firstElement;
    }

    public void setSecondElement(V secondElement) {
        this.secondElement = secondElement;
    }

    public String getFirstElement() {
        return firstElement.toString();
    }

    public String getSecondElement() {
        return secondElement.toString();
    }
}
