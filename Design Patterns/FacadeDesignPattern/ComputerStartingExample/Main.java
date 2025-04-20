package FacadeDesignPattern.ComputerStartingExample;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();

        System.out.println("------------");
        computer.shutDownComputer();
    }
}
