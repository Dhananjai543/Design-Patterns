package BehaviouralDesignPatterns.Command.ConcreteCommands;

import BehaviouralDesignPatterns.Command.Command;
import BehaviouralDesignPatterns.Command.Device;

public class TurnOnCommand implements Command {

    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
