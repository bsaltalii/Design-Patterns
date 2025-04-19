package AbstractFactoryPattern.GameExample.ThemeFactory;

import AbstractFactoryPattern.GameExample.Character.Alien;
import AbstractFactoryPattern.GameExample.Character.Character;
import AbstractFactoryPattern.GameExample.Weapon.LaserGun;
import AbstractFactoryPattern.GameExample.Weapon.Weapon;

public class ScifiFactory implements GameElementFactory{
    @Override
    public Character createCharacter() {
        return new Alien();
    }

    @Override
    public Weapon createWeapon() {
        return new LaserGun();
    }
}
