package BridgeDesignPattern.RemoteAndDeviceExample;

public abstract class RemoteControl {
    Device device;
    public RemoteControl(Device device){
        this.device=device;
    }
    void togglePower(){
        if (device.isOn()){
            device.turnOff();
        }else{
            device.turnOn();
        }
    }

    void volumeUp(){
        device.setVolume(device.getVolume()+1);
    }
    void volumeDown(){
        device.setVolume(device.getVolume()-1);
    }

    public abstract void mute();
}
