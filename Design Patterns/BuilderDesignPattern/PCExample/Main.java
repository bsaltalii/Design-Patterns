package BuilderDesignPattern.PCExample;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new GamingComputerBuilder());
        Director director2 = new Director(new OfficeComputerBuilder());

        Computer gamingComputer = director.buildComputer();
        Computer officeComputer = director2.buildComputer();

        System.out.println(gamingComputer.toString());
        System.out.println(officeComputer.toString());
    }
}
