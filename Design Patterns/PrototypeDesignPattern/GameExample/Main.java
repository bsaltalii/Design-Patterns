package PrototypeDesignPattern.GameExample;

public class Main {
    public static void main(String[] args) {

        GameCharacter baseWarrior = new Warrior("Default Warrior", 1);
        GameCharacter baseMage = new Mage("Default Mage", 1);


        GameCharacter player1 = baseWarrior.clone();
        player1.name = "Aragorn";

        GameCharacter player2 = baseMage.clone();
        player2.name = "Gandalf";


        player1.display();
        player2.display();
    }
}
