package IteratorDesignPattern.WordIterator;

import java.util.NoSuchElementException;

class WordsArrayIterator implements StrIterator {
    private final String[] array;
    private int cursor = 0;
    public WordsArrayIterator(String[] array) { this.array = array; }
    @Override
    public boolean hasNext() { return cursor < array.length; }
    @Override
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        return array[cursor++];
    }
}