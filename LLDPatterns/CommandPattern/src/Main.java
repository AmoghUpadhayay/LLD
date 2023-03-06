import Command.LightOffCommand;
import Receiver.Light;
import invoker.SimpleRemote;

public class Main {
    public static void main(String[] args) {
        SimpleRemote simpleRemote = new SimpleRemote(new LightOffCommand(new Light()));
        simpleRemote.buttonPress();
    }
}