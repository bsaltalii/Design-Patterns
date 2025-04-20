package DecoratorDesignPattern.GameCharacterExample;

public class ShieldBuff extends CharacterDecorator{
    public ShieldBuff(GameCharacter character) {
        super(character);
    }

    @Override
    public int getHealth(){
        return super.getHealth() + 50;
    }

    @Override
    public int getAttack(){
        return super.getAttack() + 20;
    }
}
