package AdapterDesignPattern.EuropeanAndUSSocketExample;

public class Main {
    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new EuropeanSocket(220);
        USDevice device = new USDevice("My device");

        SocketAdapter adapter = new SocketAdapter(europeanSocket);
        device.powerOn(adapter);
    }
}
