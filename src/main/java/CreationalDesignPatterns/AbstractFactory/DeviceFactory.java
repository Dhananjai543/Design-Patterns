package CreationalDesignPatterns.AbstractFactory;

import CreationalDesignPatterns.AbstractFactory.Products.Laptop;
import CreationalDesignPatterns.AbstractFactory.Products.Phone;

public interface DeviceFactory {

    public Phone createPhone();
    public Laptop createLaptop();

}
