package AdapterDesignPattern.EuropeanAndUSSocketExample;

public class SocketAdapter {
    EuropeanSocket socket;

    public SocketAdapter(EuropeanSocket europeanSocket){
        this.socket = europeanSocket;
    }
    public void powerOn(){
        System.out.println("Adapter converting power...");
        socket.supplyPower();
        System.out.println("Power converted to 110V. Device is now ON.");
    }
}
