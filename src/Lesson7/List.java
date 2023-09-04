package Lesson7;

public class List {

    private final Object[] elements;
    private int size;

    public List(int startValue) {
        this.elements = new Object[startValue];
    }

    public void add(Object element) {
        elements[size] = element;
        size++;
    }

    public Object get(int number) {
        return elements[number];
    }

    public int getSize(){
        return size;
    }
}
