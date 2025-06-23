package IteratorDesignPattern.BookExample;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements BookCollection{
    private List<String> books = new ArrayList<>();
    public void addBook(String book){
        books.add(book);
    }
    @Override
    public Iterator<String> createIterator() {
        return new BookIterator(books);
    }
}
