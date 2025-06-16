package IteratorDesignPattern.IteratorExample;

public class Main {
    public static void main(String[] args) {
        IntCollection numbers = new IntCollection(10, 20, 30, 40, 50);
        Iterator<Integer> it = numbers.createIterator();
        while (it.hasNext()){
            System.out.println("Value = " + it.next());
        }
    }
}
