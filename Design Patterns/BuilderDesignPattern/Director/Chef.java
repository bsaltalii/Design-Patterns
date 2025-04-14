package BuilderDesignPattern.Director;

import BuilderDesignPattern.Pizza.Pizza;
import BuilderDesignPattern.Pizza.PizzaBuilder;

public class Chef {
    private PizzaBuilder pizzaBuilder;

    public Chef(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder=pizzaBuilder;
    }

    public void makePizza(){
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
}
