package Lesson7;

public class Single<K> {

    private K element;


    public Single(K element){
        this.element = element;
    }

    public String getElement() {
        return element.toString();
    }
}
