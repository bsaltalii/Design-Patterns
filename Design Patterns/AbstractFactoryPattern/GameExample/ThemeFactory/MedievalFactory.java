package AbstractFactoryPattern.GameExample.ThemeFactory;

import AbstractFactoryPattern.GameExample.Character.Character;
import AbstractFactoryPattern.GameExample.Character.Knight;
import AbstractFactoryPattern.GameExample.Weapon.Sword;
import AbstractFactoryPattern.GameExample.Weapon.Weapon;

public class MedievalFactory implements GameElementFactory{
    @Override
    public Character createCharacter() {
        return new Knight();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
