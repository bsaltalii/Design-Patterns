package AdapterDesignPattern.USBCAndHDMI;

public class HDMIAdapter implements MediaPlayer{
    private OldMonitor monitor;
    public HDMIAdapter(OldMonitor monitor){
        this.monitor=monitor;
    }
    @Override
    public void play(String fileName) {
        monitor.connectWithHDMI(fileName);
    }
}
