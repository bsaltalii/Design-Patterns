package IteratorDesignPattern.BookExample;

public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        shelf.addBook("1984");
        shelf.addBook("Brave New World");
        shelf.addBook("Fahrenheit 451");

        Iterator<String> iterator = shelf.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
