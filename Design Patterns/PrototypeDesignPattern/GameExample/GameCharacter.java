package PrototypeDesignPattern.GameExample;

public abstract class GameCharacter {
    protected String name;
    protected String type;
    protected int level;

    public GameCharacter(String name,String type,int level){
        this.name=name;
        this.type=type;
        this.level=level;
    }

    public void display(){
        System.out.println(" Name : " + name + " Type : "+ type + " Level : " + level);
    }

    public abstract GameCharacter clone();
}
