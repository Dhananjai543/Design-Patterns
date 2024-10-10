package CreationalDesignPatterns.AbstractFactory.ConcreteFactories;

import CreationalDesignPatterns.AbstractFactory.*;
import CreationalDesignPatterns.AbstractFactory.ConcreteProducts.MacLaptop;
import CreationalDesignPatterns.AbstractFactory.ConcreteProducts.MacPhone;
import CreationalDesignPatterns.AbstractFactory.Products.Laptop;
import CreationalDesignPatterns.AbstractFactory.Products.Phone;

public class MacDeviceFactory implements DeviceFactory {
    @Override
    public Phone createPhone() {
        return new MacPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new MacLaptop();
    }
}
