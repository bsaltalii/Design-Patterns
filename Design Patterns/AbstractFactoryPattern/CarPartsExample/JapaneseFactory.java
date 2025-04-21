package AbstractFactoryPattern.CarPartsExample;

public class JapaneseFactory implements CarPartsFactory{
    @Override
    public Engine createEngine() {
        return new JapaneseEngine();
    }

    @Override
    public Tire createTire() {
        return new JapaneseTire();
    }
}
