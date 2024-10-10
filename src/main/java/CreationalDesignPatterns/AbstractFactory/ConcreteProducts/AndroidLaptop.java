package CreationalDesignPatterns.AbstractFactory.ConcreteProducts;

import CreationalDesignPatterns.AbstractFactory.Products.Laptop;

public class AndroidLaptop implements Laptop {
    @Override
    public void bootOS() {
        System.out.println("Booting Android OS on Laptop");
    }
}
