package BuilderDesignPattern.CoffeeExample;

public class LatteBuilder implements CoffeeBuilder{
    Coffee coffee;

    public LatteBuilder(){
        this.coffee = new Coffee();
    }
    @Override
    public void size(String size) {
        coffee.setSize(size);
    }

    @Override
    public void milk() {
        coffee.setMilk(true);
    }

    @Override
    public void sugar() {
        coffee.setSugar(false);
    }

    @Override
    public void whippedCream() {
        coffee.setWhippedCream(false);
    }

    @Override
    public Coffee build() {
        return coffee;
    }
}
