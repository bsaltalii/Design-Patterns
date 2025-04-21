package BuilderDesignPattern.CoffeeExample;

public class CoffeeDirector {
    CoffeeBuilder builder;

    public CoffeeDirector(CoffeeBuilder builder){
        this.builder=builder;
    }

    public Coffee makeCoffee() {
        builder.size("Medium");
        builder.milk();
        builder.sugar();
        builder.whippedCream();
        return builder.build();
    }
}
