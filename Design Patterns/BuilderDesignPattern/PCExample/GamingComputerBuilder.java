package BuilderDesignPattern.PCExample;

public class GamingComputerBuilder implements ComputerBuilder{
    Computer computer;
    public GamingComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void cpu() {
        this.computer.setCpu("Intel i9");
    }

    @Override
    public void ram() {
        this.computer.setRam("32GB");
    }

    @Override
    public void storage() {
        this.computer.setStorage("1TB");
    }

    @Override
    public void gpu() {
        this.computer.setGpu("RTX 4050TI");
    }

    @Override
    public Computer build(){
        return this.computer;
    }
}
