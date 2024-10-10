package CreationalDesignPatterns.AbstractFactory.ConcreteProducts;

import CreationalDesignPatterns.AbstractFactory.Products.Phone;

public class AndroidPhone implements Phone {
    @Override
    public void makeCall() {
        System.out.println("Making a call from Android Phone");
    }
}
