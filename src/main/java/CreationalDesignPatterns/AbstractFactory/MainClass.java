package CreationalDesignPatterns.AbstractFactory;

import CreationalDesignPatterns.AbstractFactory.ConcreteFactories.AndroidDeviceFactory;
import CreationalDesignPatterns.AbstractFactory.ConcreteFactories.MacDeviceFactory;
import CreationalDesignPatterns.AbstractFactory.ConcreteProducts.AndroidLaptop;
import CreationalDesignPatterns.AbstractFactory.ConcreteProducts.AndroidPhone;
import CreationalDesignPatterns.AbstractFactory.Products.Laptop;
import CreationalDesignPatterns.AbstractFactory.Products.Phone;

public class MainClass {
    public static void main(String[] args) {
        DeviceFactory androidFactory = new AndroidDeviceFactory();
        Laptop androidLaptop = androidFactory.createLaptop();
        androidLaptop.bootOS();
        Phone androidPhone = androidFactory.createPhone();
        androidPhone.makeCall();

        System.out.println("---------");

        DeviceFactory macFactory = new MacDeviceFactory();
        Laptop macLaptop = macFactory.createLaptop();
        macLaptop.bootOS();
        Phone macPhone = macFactory.createPhone();
        macPhone.makeCall();
    }
}
