package AbstractFactoryPattern.GameExample;

import AbstractFactoryPattern.GameExample.Character.Character;
import AbstractFactoryPattern.GameExample.Character.Knight;
import AbstractFactoryPattern.GameExample.ThemeFactory.GameElementFactory;
import AbstractFactoryPattern.GameExample.ThemeFactory.MedievalFactory;
import AbstractFactoryPattern.GameExample.ThemeFactory.ScifiFactory;
import AbstractFactoryPattern.GameExample.Weapon.Sword;
import AbstractFactoryPattern.GameExample.Weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        GameElementFactory factory = new ScifiFactory();

        Character character = factory.createCharacter();
        Weapon weapon = factory.createWeapon();

        character.attack();
        weapon.use();

        System.out.println("--------");

        factory = new MedievalFactory();
        character = new Knight();
        weapon = new Sword();

        character.attack();
        weapon.use();
    }
}
