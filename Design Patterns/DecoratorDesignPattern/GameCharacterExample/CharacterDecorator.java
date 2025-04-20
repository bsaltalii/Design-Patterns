package DecoratorDesignPattern.GameCharacterExample;

public abstract class CharacterDecorator implements GameCharacter {
    protected GameCharacter character;

    public CharacterDecorator(GameCharacter character){
        this.character=character;
    }

    @Override
    public int getHealth(){
        return character.getHealth();
    }

    @Override
    public int getAttack(){
        return character.getAttack();
    }
}
