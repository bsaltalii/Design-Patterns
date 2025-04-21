package BuilderDesignPattern.CoffeeExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Latte:");
        CoffeeBuilder latteBuilder = new LatteBuilder();
        CoffeeDirector latteDirector = new CoffeeDirector(latteBuilder);
        Coffee latte = latteDirector.makeCoffee();
        System.out.println(latte);

        System.out.println("\nSweet Coffee:");
        CoffeeBuilder sweetBuilder = new SweetCoffeeBuilder();
        CoffeeDirector sweetDirector = new CoffeeDirector(sweetBuilder);
        Coffee sweet = sweetDirector.makeCoffee();
        System.out.println(sweet);
    }
}
