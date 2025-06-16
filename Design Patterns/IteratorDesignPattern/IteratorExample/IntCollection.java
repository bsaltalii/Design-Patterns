package IteratorDesignPattern.IteratorExample;

public class IntCollection implements Aggregate<Integer> {
    private final int[] data;
    public IntCollection(int... nums) {
        data = nums.clone();
    }
    @Override
    public Iterator<Integer> createIterator() {
        return new IntArrayIterator(data);
    }
}