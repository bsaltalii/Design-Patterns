package AbstractFactoryPattern.CarPartsExample;

public class GermanTire implements Tire{
    @Override
    public void design() {
        System.out.println("German Tire designed.");
    }
}
