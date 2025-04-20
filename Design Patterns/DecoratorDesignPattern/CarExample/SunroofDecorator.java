package DecoratorDesignPattern.CarExample;

import DecoratorDesignPattern.CarExample.Car;
import DecoratorDesignPattern.CarExample.CarDecorator;

public class SunroofDecorator extends CarDecorator {
    public SunroofDecorator(Car car) {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(", with Sunroof");
    }
}
