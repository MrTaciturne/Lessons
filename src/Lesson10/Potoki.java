package Lesson10;

import Lesson8.Biblioteka.Book;

import java.util.ArrayList;
import java.util.Comparator;

public class Potoki {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(2, "Я робот", "Азимов"));
        books.add(new Book(4, "Академия и Империя", "Азимов"));
        books.add(new Book(2, "Завтрашний день кошки", "Бернар Вербер"));
        books.add(new Book(5, "Муравьи", "Бернар Вербер"));
        books.add(new Book(1, "Трудно быть Богом", "Стругацкие"));

        books.stream()
                .sorted(Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle))
                .forEach(book -> System.out.println(book));
    }
}
