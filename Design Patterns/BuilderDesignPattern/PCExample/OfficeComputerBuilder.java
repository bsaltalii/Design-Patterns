package BuilderDesignPattern.PCExample;

public class OfficeComputerBuilder implements ComputerBuilder{
    Computer computer;
    public OfficeComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void cpu() {
        this.computer.setCpu("AMD Ryzen 5");
    }

    @Override
    public void ram() {
        this.computer.setRam("8GB");
    }

    @Override
    public void storage() {
        this.computer.setStorage("500GB");
    }

    @Override
    public void gpu() {
        this.computer.setGpu("RX 580");
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
