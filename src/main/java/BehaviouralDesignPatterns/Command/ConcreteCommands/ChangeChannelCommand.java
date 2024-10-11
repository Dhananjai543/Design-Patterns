package BehaviouralDesignPatterns.Command.ConcreteCommands;

import BehaviouralDesignPatterns.Command.Command;
import BehaviouralDesignPatterns.Command.Device;
import BehaviouralDesignPatterns.Command.Devices.TV;

public class ChangeChannelCommand implements Command {

    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.changeChannel();
    }
}
