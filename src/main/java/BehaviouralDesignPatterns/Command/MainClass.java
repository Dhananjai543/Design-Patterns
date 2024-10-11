package BehaviouralDesignPatterns.Command;

import BehaviouralDesignPatterns.Command.ConcreteCommands.AdjustVolumeCommand;
import BehaviouralDesignPatterns.Command.ConcreteCommands.ChangeChannelCommand;
import BehaviouralDesignPatterns.Command.ConcreteCommands.TurnOffCommand;
import BehaviouralDesignPatterns.Command.ConcreteCommands.TurnOnCommand;
import BehaviouralDesignPatterns.Command.Devices.Stereo;
import BehaviouralDesignPatterns.Command.Devices.TV;

public class MainClass {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        TV tv = new TV();
        Stereo stereo = new Stereo();

        TurnOnCommand turnOnTV = new TurnOnCommand(tv);
        TurnOffCommand turnOffTV = new TurnOffCommand(tv);
        TurnOnCommand turnOnStereo = new TurnOnCommand(stereo);
        TurnOffCommand turnOffStereo = new TurnOffCommand(stereo);

        ChangeChannelCommand changeChannel = new ChangeChannelCommand(tv);
        AdjustVolumeCommand adjustVolume = new AdjustVolumeCommand(stereo);

        remote.setCommand(turnOnTV);
        remote.pressButton();

        remote.setCommand(turnOnStereo);
        remote.pressButton();

        remote.setCommand(changeChannel);
        remote.pressButton();

        remote.setCommand(adjustVolume);
        remote.pressButton();

        remote.setCommand(turnOffStereo);
        remote.pressButton();

        remote.setCommand(turnOffTV);
        remote.pressButton();
    }
}
