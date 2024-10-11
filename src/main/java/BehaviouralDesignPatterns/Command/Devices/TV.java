package BehaviouralDesignPatterns.Command.Devices;

import BehaviouralDesignPatterns.Command.Device;

public class TV implements Device {

        @Override
        public void turnOn() {
            System.out.println("TV is ON");
        }

        @Override
        public void turnOff() {
            System.out.println("TV is OFF");
        }

        public void changeChannel() {
            System.out.println("Channel changed");
        }
}
