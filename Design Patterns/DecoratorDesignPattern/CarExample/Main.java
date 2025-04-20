package DecoratorDesignPattern.CarExample;

import DecoratorDesignPattern.CarExample.BasicCar;
import DecoratorDesignPattern.CarExample.Car;
import DecoratorDesignPattern.CarExample.LeatherSeatsDecorator;
import DecoratorDesignPattern.CarExample.SunroofDecorator;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();
        System.out.println();

        Car sunroofCar = new SunroofDecorator(new BasicCar());
        sunroofCar.assemble();
        System.out.println();

        Car leatherSeatsCar = new LeatherSeatsDecorator(new BasicCar());
        leatherSeatsCar.assemble();
        System.out.println();

        Car luxuryCar = new LeatherSeatsDecorator(new SunroofDecorator(new BasicCar()));
        luxuryCar.assemble();
        System.out.println();
    }
}
