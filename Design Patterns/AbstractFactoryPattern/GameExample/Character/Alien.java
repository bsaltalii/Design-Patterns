package AbstractFactoryPattern.GameExample.Character;

public class Alien implements Character{
    @Override
    public void attack() {
        System.out.println("Alien attacks with plasma rays!");
    }
}
