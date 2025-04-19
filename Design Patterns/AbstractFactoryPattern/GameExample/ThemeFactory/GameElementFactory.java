package AbstractFactoryPattern.GameExample.ThemeFactory;

import AbstractFactoryPattern.GameExample.Character.Character;
import AbstractFactoryPattern.GameExample.Weapon.Weapon;

public interface GameElementFactory {
    Character createCharacter();
    Weapon createWeapon();
}
