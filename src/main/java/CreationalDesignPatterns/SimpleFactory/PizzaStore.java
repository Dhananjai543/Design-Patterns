package CreationalDesignPatterns.SimpleFactory;

public class PizzaStore {

    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String pizzaType){
        Pizza pizza;

        pizza = factory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;

    }
    //other methods

    public static void main(String[] args) {
        SimplePizzaFactory factory1 = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory1);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Pizza type: " + pizza.getClass().getSimpleName());

        Pizza pizza2 = store.orderPizza("pepperoni");
        System.out.println("Pizza type: " + pizza2.getClass().getSimpleName());
    }
}