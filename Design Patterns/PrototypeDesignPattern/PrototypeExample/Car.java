package PrototypeDesignPattern.PrototypeExample;

public class Car implements Prototype {
    public String brand;
    public String model;
    public String color;
    public int topSpeed;

    public Car(String brand,String model,String color,int topSpeed){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.topSpeed=topSpeed;
    }

    public Car(Car car){
        this.brand=car.brand;
        this.model=car.model;
        this.color=car.color;
        this.topSpeed=car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
