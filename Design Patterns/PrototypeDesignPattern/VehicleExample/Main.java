package PrototypeDesignPattern.VehicleExample;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bus("Mercedes","2021","White",45);
        Vehicle v2 = new Car("Audi","2022","Gray",220);
        Vehicle v3 = v2.clone();
        System.out.println(v3.color);
    }
}
