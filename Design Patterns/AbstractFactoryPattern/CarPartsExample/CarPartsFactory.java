package AbstractFactoryPattern.CarPartsExample;

public interface CarPartsFactory {
    Engine createEngine();
    Tire createTire();
}
