package BuilderDesignPattern.PCExample;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    @Override
    public String toString(){
        return " CPU : "+ this.cpu +" Ram : " + this.ram + " Storage : " +this.storage + " GPU : " +this.gpu;
    }
}
