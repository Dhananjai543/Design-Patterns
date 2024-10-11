package BehaviouralDesignPatterns.Command.ConcreteCommands;

import BehaviouralDesignPatterns.Command.Command;
import BehaviouralDesignPatterns.Command.Devices.Stereo;

public class AdjustVolumeCommand implements Command {

    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}
