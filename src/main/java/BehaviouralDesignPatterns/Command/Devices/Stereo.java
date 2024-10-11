package BehaviouralDesignPatterns.Command.Devices;

import BehaviouralDesignPatterns.Command.Device;

public class Stereo implements Device {
    @Override
    public void turnOn() {
        System.out.println("Stereo is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is OFF");
    }

    public void adjustVolume(){
        System.out.println("Volume adjusted");
    }
}
