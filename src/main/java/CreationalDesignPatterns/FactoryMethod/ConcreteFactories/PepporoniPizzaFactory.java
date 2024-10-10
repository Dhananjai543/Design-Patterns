package CreationalDesignPatterns.FactoryMethod.ConcreteFactories;

import CreationalDesignPatterns.FactoryMethod.ConcreteProducts.PepporoniPizza;
import CreationalDesignPatterns.FactoryMethod.Pizza;
import CreationalDesignPatterns.FactoryMethod.PizzaFactory;

public class PepporoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepporoniPizza();
    }
}
