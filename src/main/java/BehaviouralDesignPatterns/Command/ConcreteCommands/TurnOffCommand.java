package BehaviouralDesignPatterns.Command.ConcreteCommands;

import BehaviouralDesignPatterns.Command.Command;
import BehaviouralDesignPatterns.Command.Device;

public class TurnOffCommand implements Command {

    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.turnOff();
    }
}
