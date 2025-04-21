package AdapterDesignPattern.EuropeanAndUSSocketExample;

public class EuropeanSocket {
    int voltage;
    public EuropeanSocket(int voltage){
        this.voltage=voltage;
    }
    public void supplyPower(){
        System.out.println("Supplying " + voltage + "V power from European socket.");
    }
}
