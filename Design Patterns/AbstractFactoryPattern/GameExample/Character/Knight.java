package AbstractFactoryPattern.GameExample.Character;

public class Knight implements Character{
    @Override
    public void attack() {
        System.out.println("Knight attacks with honor!");
    }
}
