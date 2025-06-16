package IteratorDesignPattern.IteratorExample;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
