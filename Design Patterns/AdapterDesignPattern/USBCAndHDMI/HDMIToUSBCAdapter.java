package AdapterDesignPattern.USBCAndHDMI;

public class HDMIToUSBCAdapter implements USBTypeCPlayer{
    private OldMonitor oldMonitor;
    public HDMIToUSBCAdapter(OldMonitor monitor){
        this.oldMonitor = monitor;
    }
    @Override
    public void playViaUSBC(String fileName) {
        System.out.println("Converting USB-C to HDMI...");
        oldMonitor.connectWithHDMI(fileName);
    }
}
