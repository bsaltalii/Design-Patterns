package FacadeDesignPattern.ComputerStartingExample;

public class ComputerFacade {
    private Cpu cpu;
    private HardDisk hardDisk;
    private OperatingSystem os;
    private PowerSupply powerSupply;

    public ComputerFacade(){
        cpu = new Cpu();
        hardDisk = new HardDisk();
        os = new OperatingSystem();
        powerSupply = new PowerSupply();
    }
    public void startComputer(){
        powerSupply.turnOn();
        System.out.println("Computer starting.");
        cpu.execute();
        os.load();
        hardDisk.readData();
    }
    public void shutDownComputer(){
        System.out.println("Computer shutting down.");
        powerSupply.turnOff();
    }
}
