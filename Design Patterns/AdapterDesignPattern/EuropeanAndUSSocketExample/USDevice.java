package AdapterDesignPattern.EuropeanAndUSSocketExample;

public class USDevice {
    String name;
    public USDevice(String name){
        this.name=name;
    }
    public void powerOn(SocketAdapter adapter){
        System.out.println(name + " is trying to power on...");
        adapter.powerOn();
    }
}
