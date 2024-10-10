package StructuralDesignPatterns.Adapter;

public class IPhone6s implements IPhone{

    Charger IPhone4sTo6sAdapter;

    public IPhone6s() {
        this.IPhone4sTo6sAdapter = new IPhone4sTo6sAdapter();
    }
    @Override
    public void onCharge() {
        this.IPhone4sTo6sAdapter.charge();
    }
}
