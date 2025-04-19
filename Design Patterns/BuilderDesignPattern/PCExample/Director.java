package BuilderDesignPattern.PCExample;

public class Director {
    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder){
        this.computerBuilder=computerBuilder;
    }

    public Computer buildComputer(){
        computerBuilder.cpu();
        computerBuilder.ram();
        computerBuilder.storage();
        computerBuilder.gpu();
        return computerBuilder.build();
    }
}
