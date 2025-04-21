package BridgeDesignPattern.RemoteAndDeviceExample;

public class TV implements Device{
    private boolean isOn;
    private int volume;
    @Override
    public void turnOn() {
        this.isOn=true;
        System.out.println("Device turn on.");
    }

    @Override
    public void turnOff() {
        this.isOn=false;
        System.out.println("Device turn off.");
    }

    @Override
    public void setVolume(int level) {
        this.volume=level;
        System.out.println("New volume : " + this.volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
    @Override
    public boolean isOn() {
        return isOn;
    }
}
