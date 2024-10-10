package StructuralDesignPatterns.Decorator;

public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Mushroom";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 3.0;
    }
}
