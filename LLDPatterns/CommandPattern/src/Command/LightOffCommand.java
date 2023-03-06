package Command;
// Implementation to turn light off

import Command.Command;
import Receiver.Light;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
