package StructuralDesignPatterns.Decorator;

public class PizzaShop {
    public static void main(String[] args) {

        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + ", " + pizza.cost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + ", " + pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + ", " + pizza.cost());


    }
}
