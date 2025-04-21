package AbstractFactoryPattern.CarPartsExample;

public class GermanFactory implements CarPartsFactory{
    @Override
    public Engine createEngine() {
        return new GermanEngine();
    }

    @Override
    public Tire createTire() {
        return new GermanTire();
    }
}
