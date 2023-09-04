package Lesson7;

import java.sql.Time;
import java.util.Scanner;

public class ToDoRunner {

    public static void main(String[] args) throws InterruptedException {

        ToDo toDoList = new ToDo();
        toDoList.add("Помыть раму");
        toDoList.add("Испачкать раму");
        toDoList.list();
        System.out.println();
        toDoList.add("Сломать раму");
        toDoList.delete(0);
        toDoList.list();
        System.out.println();
        toDoList.edit(1, "Сделать раму");
        toDoList.list();

    }


}
