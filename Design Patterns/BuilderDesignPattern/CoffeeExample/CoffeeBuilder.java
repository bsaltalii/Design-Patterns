package BuilderDesignPattern.CoffeeExample;

public interface CoffeeBuilder {
    void size(String size);
    void milk();
    void sugar();
    void whippedCream();
    Coffee build();
}
