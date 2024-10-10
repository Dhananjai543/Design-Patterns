package CreationalDesignPatterns.FactoryMethod;

public class Client {
    private final Pizza pizza;

    public Client(PizzaFactory pizzaFactory) {
        pizza = pizzaFactory.createPizza();
    }

    public Pizza getPizza() {
        return pizza;
    }
}
