package StructuralDesignPatterns.Decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2.0;
    }

}
