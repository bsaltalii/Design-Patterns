package PrototypeDesignPattern.VehicleExample;

public class Bus extends Vehicle {
    public int seatCount;

    public Bus(String brand,String model,String color,int seatCount){
        super(brand, model, color);
        this.seatCount=seatCount;
    }
    public Bus(Bus bus){
        super(bus);
        this.seatCount= bus.seatCount;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
