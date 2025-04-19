package AdapterDesignPattern.USBCAndHDMI;

public class Main {
    public static void main(String[] args) {
        OldMonitor oldMonitor = new OldMonitor();

        USBTypeCPlayer usbTypeCPlayer = new HDMIToUSBCAdapter(oldMonitor);

        usbTypeCPlayer.playViaUSBC("finalPresentation.mp4");
    }
}
