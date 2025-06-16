package IteratorDesignPattern.WordIterator;

public class Main {
    public static void main(String[] args) {
        WordCollection sentence = new WordCollection("Design patterns make code reusable");
        StrIterator it = sentence.createIterator();

        System.out.println("Traversing sentence word–by–word:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
