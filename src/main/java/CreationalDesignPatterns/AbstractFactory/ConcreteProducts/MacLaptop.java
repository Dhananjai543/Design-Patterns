package CreationalDesignPatterns.AbstractFactory.ConcreteProducts;

import CreationalDesignPatterns.AbstractFactory.Products.Laptop;

public class MacLaptop implements Laptop {
    @Override
    public void bootOS() {
        System.out.println("Booting Mac OS on Laptop");
    }
}
