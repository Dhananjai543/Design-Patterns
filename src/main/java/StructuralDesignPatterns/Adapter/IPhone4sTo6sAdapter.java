package StructuralDesignPatterns.Adapter;

public class IPhone4sTo6sAdapter implements Charger{

    IPhone4sCharger iPhone4sCharger;

    public IPhone4sTo6sAdapter(){
        this.iPhone4sCharger = new IPhone4sCharger();
    }
    @Override
    public void charge() {
        iPhone4sCharger.charge();
    }
}
