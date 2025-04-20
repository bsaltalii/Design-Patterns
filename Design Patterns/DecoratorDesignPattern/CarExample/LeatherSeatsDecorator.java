package DecoratorDesignPattern.CarExample;

import DecoratorDesignPattern.CarExample.Car;
import DecoratorDesignPattern.CarExample.CarDecorator;

public class LeatherSeatsDecorator extends CarDecorator {
    public LeatherSeatsDecorator(Car car) {
        super(car);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.print(", with Leather seats");
    }
}
