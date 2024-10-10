package CreationalDesignPatterns.AbstractFactory.ConcreteFactories;

import CreationalDesignPatterns.AbstractFactory.*;
import CreationalDesignPatterns.AbstractFactory.ConcreteProducts.AndroidLaptop;
import CreationalDesignPatterns.AbstractFactory.ConcreteProducts.AndroidPhone;
import CreationalDesignPatterns.AbstractFactory.Products.Laptop;
import CreationalDesignPatterns.AbstractFactory.Products.Phone;

public class AndroidDeviceFactory implements DeviceFactory {
    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new AndroidLaptop();
    }
}
