package PrototypeDesignPattern.GameExample;

public class Mage extends GameCharacter{
    public Mage(String name,int level){
        super(name,"Mage",level);
    }
    @Override
    public GameCharacter clone() {
        return (this);
    }
}
