package AbstractFactoryPattern.CarPartsExample;

public class GermanEngine implements Engine{
    @Override
    public void design() {
        System.out.println("German engine designed.");
    }
}
