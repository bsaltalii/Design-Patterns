package CommandDesingPattern.TvControllerExample;

public class Main {
    public static void main(String[] args) {
        TV myTv = new TV();

        Command on = new TurnOnCommand(myTv);
        Command off = new TurnOffCommand(myTv);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(on);
        remoteControl.pressButton();

        remoteControl.setCommand(off);
        remoteControl.pressButton();
    }
}
