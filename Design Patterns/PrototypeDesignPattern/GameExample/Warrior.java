package PrototypeDesignPattern.GameExample;

public class Warrior extends GameCharacter{
    public Warrior(String name,int level){
        super(name,"Warrior",level);
    }
    @Override
    public GameCharacter clone() {
        return (this);
    }
}
