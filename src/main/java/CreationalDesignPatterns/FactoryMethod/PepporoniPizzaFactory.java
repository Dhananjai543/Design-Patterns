package CreationalDesignPatterns.FactoryMethod;

public class PepporoniPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PepporoniPizza();
    }
}
