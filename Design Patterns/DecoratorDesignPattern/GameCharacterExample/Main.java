package DecoratorDesignPattern.GameCharacterExample;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new BasicCharacter();
        System.out.println("Base -> Health: " + character.getHealth() + ", Attack: " + character.getAttack());

        character = new ShieldBuff(character);
        System.out.println("With Shield -> Health: " + character.getHealth() + ", Attack: " + character.getAttack());

        character = new SwordBuff(character);
        System.out.println("With Shield + Sword -> Health: " + character.getHealth() + ", Attack: " + character.getAttack());
    }
}
