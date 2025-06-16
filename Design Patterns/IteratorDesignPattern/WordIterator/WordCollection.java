package IteratorDesignPattern.WordIterator;

public class WordCollection implements WordAggregate{
    private final String[] words;
    public WordCollection(String sentence){
        this.words = sentence.split("\\s+");
    }

    @Override
    public StrIterator createIterator(){
        return new WordsArrayIterator(words);
    }
}
