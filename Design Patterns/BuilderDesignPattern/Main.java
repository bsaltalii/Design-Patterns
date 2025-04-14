package BuilderDesignPattern;

import BuilderDesignPattern.Builders.MargaritaPizzaBuilder;
import BuilderDesignPattern.Builders.SpicyPizzaBuilder;
import BuilderDesignPattern.Director.Chef;
import BuilderDesignPattern.Pizza.Pizza;
import BuilderDesignPattern.Pizza.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder margaritaBuilder = new MargaritaPizzaBuilder();
        Chef chef = new Chef(margaritaBuilder);
        chef.makePizza();
        Pizza margarita = chef.getPizza();
        System.out.println(margarita);

        PizzaBuilder spicyBuilder = new SpicyPizzaBuilder();
        chef = new Chef(spicyBuilder);
        chef.makePizza();
        Pizza spicyPizza = chef.getPizza();
        System.out.println(spicyPizza);
    }
}
