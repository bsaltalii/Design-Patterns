package CommandDesingPattern.RemoteControlExample;

import CommandDesingPattern.RemoteControlExample.Command;
import CommandDesingPattern.RemoteControlExample.Light;

public class TurnOnLightCommand implements Command {
    private Light light;
    public TurnOnLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
