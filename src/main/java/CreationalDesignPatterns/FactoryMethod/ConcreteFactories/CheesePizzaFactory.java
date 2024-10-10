package CreationalDesignPatterns.FactoryMethod.ConcreteFactories;

import CreationalDesignPatterns.FactoryMethod.ConcreteProducts.CheezePizza;
import CreationalDesignPatterns.FactoryMethod.Pizza;
import CreationalDesignPatterns.FactoryMethod.PizzaFactory;
import CreationalDesignPatterns.FactoryMethod.ConcreteProducts.CheezePizza;

public class CheesePizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new CheezePizza();
    }
}
