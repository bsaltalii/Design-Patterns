package DecoratorDesignPattern.GameCharacterExample;

public class SwordBuff extends CharacterDecorator{
    public SwordBuff(GameCharacter character) {
        super(character);
    }
    @Override
    public int getAttack(){
        return super.getAttack() + 20;
    }
}
