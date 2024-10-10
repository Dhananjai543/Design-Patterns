package CreationalDesignPatterns.FactoryMethod.ConcreteFactories;

import CreationalDesignPatterns.FactoryMethod.ConcreteProducts.MushroomPizza;
import CreationalDesignPatterns.FactoryMethod.Pizza;
import CreationalDesignPatterns.FactoryMethod.PizzaFactory;

public class MushroomPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MushroomPizza();
    }
}
