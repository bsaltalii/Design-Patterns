package PrototypeDesignPattern;

import PrototypeDesignPattern.VehicleExample.Bus;
import PrototypeDesignPattern.VehicleExample.Car;
import PrototypeDesignPattern.VehicleExample.Vehicle;

public class Main {
    public static void main(String[] args) {
        PrototypeDesignPattern.VehicleExample.Vehicle v1 = new Bus("Mercedes","2021","White",45);
        PrototypeDesignPattern.VehicleExample.Vehicle v2 = new Car("Audi","2022","Gray",220);
        Vehicle v3 = v2.clone();
        System.out.println(v3.color);
    }
}
