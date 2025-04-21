package BridgeDesignPattern.RemoteAndDeviceExample;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }
    @Override
    public void mute(){
        super.device.setVolume(0);
    }
}
