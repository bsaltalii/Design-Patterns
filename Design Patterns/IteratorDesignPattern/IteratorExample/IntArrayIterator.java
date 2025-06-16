package IteratorDesignPattern.IteratorExample;

import java.util.NoSuchElementException;

public class IntArrayIterator implements Iterator<Integer>{
    private final int[] array;
    private int cursor = 0;
    public IntArrayIterator(int[] array){
        this.array = array;
    }
    @Override
    public boolean hasNext() {
        return cursor < array.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        return array[cursor++];
    }
}
