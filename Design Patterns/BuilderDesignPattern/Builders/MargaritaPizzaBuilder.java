package BuilderDesignPattern.Builders;

import BuilderDesignPattern.Pizza.Pizza;
import BuilderDesignPattern.Pizza.PizzaBuilder;

public class MargaritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargaritaPizzaBuilder(){
        this.pizza = new Pizza();
    }
    @Override
    public void buildDough() {
        pizza.setDough("Thin crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Mozzarella cheese");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
