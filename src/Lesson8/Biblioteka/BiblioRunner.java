package Lesson8.Biblioteka;

import java.util.ArrayList;

public class BiblioRunner {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(2, "Я робот", "Азимов"));
        books.add(new Book(4, "Академия и Империя", "Азимов"));
        books.add(new Book(2, "Завтрашний день кошки", "Бернар Вербер"));
        books.add(new Book(5, "Муравьи", "Бернар Вербер"));
        books.add(new Book(1, "Трудно быть Богом", "Стругацикик"));

        books.sort(Book::compareTo);
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
