package DecoratorDesignPattern.GameCharacterExample;

public class BasicCharacter implements GameCharacter{
    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getAttack() {
        return 10;
    }
}
