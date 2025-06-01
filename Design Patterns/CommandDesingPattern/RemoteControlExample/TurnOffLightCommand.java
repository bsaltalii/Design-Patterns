package CommandDesingPattern.RemoteControlExample;

import CommandDesingPattern.RemoteControlExample.Command;
import CommandDesingPattern.RemoteControlExample.Light;

public class TurnOffLightCommand implements Command {
    private Light light;
    public TurnOffLightCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
