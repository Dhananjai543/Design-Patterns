package BehaviouralDesignPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book(100, "Book1"));
        bookCollection.add(new Book(200, "Book2"));
        bookCollection.add(new Book(300, "Book3"));
        bookCollection.add(new Book(400, "Book4"));
        bookCollection.add(new Book(500, "Book5"));

        BookIterator iterator = new BookIterator(bookCollection);
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Book Name: " + book.getBookName() + ", Price: " + book.getPrice());
        }
    }
}
