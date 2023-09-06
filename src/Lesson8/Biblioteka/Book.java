package Lesson8.Biblioteka;


public class Book implements Comparable<Book> {

    private int id;
    private String title;
    private String author;



    Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(id, o.id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
