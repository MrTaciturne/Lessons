package Lesson7;

import java.util.ArrayList;
import java.util.List;

public class ToDo {

    private List<String> list = new ArrayList<>();

    public void add(String string) {
        list.add(string);
    }

    public void list() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i +". " + list.get(i));
        }
    }

    public void edit(int i, String string){
        list.add(i, string);
    }

    public void delete(int i){
        list.remove(i);
    }

}
