package StructuralDesignPatterns.Adapter;

//ADAPTEE
public class IPhone4sCharger implements Charger{
    @Override
    public void charge() {
        System.out.println("Charging with IPhone 4s Charger");
    }
}
