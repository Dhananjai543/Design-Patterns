package CreationalDesignPatterns.FactoryMethod;

public class MushroomPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new MushroomPizza();
    }
}
