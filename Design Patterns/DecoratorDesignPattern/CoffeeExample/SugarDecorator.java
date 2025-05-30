package DecoratorDesignPattern.CoffeeExample;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost(){
        return super.getCost() + 1.5;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+ " +sugar";
    }
}
