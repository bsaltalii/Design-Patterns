package BridgeDesignPattern.RemoteAndDeviceExample;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remoteControl = new AdvancedRemoteControl(tv);
        remoteControl.togglePower();
        remoteControl.volumeUp();
        remoteControl.mute();
    }
}
