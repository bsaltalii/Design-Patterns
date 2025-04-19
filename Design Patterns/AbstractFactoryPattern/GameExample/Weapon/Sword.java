package AbstractFactoryPattern.GameExample.Weapon;

public class Sword implements Weapon{
    @Override
    public void use() {
        System.out.println("Swinging sword!");
    }
}
