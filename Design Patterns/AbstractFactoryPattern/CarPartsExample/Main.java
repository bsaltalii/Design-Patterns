package AbstractFactoryPattern.CarPartsExample;

public class Main {
    public static void main(String[] args) {
        GermanFactory germanFactory = new GermanFactory();
        Engine germanEngine = germanFactory.createEngine();
        germanEngine.design();
        Tire germanTire = germanFactory.createTire();
        germanTire.design();

        System.out.println("---------");

        JapaneseFactory Japanesefactory = new JapaneseFactory();
        Engine japaneseEngine = Japanesefactory.createEngine();
        japaneseEngine.design();
        Tire japaneseTire = Japanesefactory.createTire();
        japaneseTire.design();
    }
}
