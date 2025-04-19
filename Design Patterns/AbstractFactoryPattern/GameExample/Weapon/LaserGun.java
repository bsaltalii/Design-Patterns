package AbstractFactoryPattern.GameExample.Weapon;

public class LaserGun implements Weapon{
    @Override
    public void use() {
        System.out.println("Firing Laser Gun!");
    }
}
