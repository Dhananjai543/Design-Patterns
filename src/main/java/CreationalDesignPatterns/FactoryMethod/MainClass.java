package CreationalDesignPatterns.FactoryMethod;

public class MainClass {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new CheesePizzaFactory();
        Client client = new Client(pizzaFactory);
        Pizza pizza = client.getPizza();
        pizza.prepare();
    }
}
