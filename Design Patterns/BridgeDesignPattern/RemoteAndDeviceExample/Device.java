package BridgeDesignPattern.RemoteAndDeviceExample;

public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int level);
    int getVolume();
    boolean isOn();
}
