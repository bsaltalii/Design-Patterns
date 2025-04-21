package AbstractFactoryPattern.CarPartsExample;

public class JapaneseTire implements Tire{
    @Override
    public void design() {
        System.out.println("Japanese tire designed.");
    }
}
