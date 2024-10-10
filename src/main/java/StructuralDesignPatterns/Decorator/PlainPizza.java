package StructuralDesignPatterns.Decorator;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "This is a plain pizza";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}
