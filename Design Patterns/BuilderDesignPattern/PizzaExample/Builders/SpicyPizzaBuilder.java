package BuilderDesignPattern.PizzaExample.Builders;

import BuilderDesignPattern.PizzaExample.Pizza;
import BuilderDesignPattern.PizzaExample.PizzaBuilder;

public class SpicyPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    public SpicyPizzaBuilder(){
        this.pizza = new Pizza();
    }
    @Override
    public void buildDough() {
        pizza.setDough("Thick crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Spicy sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Pepperoni & Jalapeno");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
