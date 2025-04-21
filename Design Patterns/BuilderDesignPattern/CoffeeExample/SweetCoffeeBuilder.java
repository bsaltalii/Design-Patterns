package BuilderDesignPattern.CoffeeExample;

public class SweetCoffeeBuilder implements CoffeeBuilder{
    Coffee coffee;
    public SweetCoffeeBuilder(){
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
        coffee.setSugar(true);
    }

    @Override
    public void whippedCream() {
        coffee.setWhippedCream(true);
    }

    @Override
    public Coffee build() {
        return coffee;
    }
}
