package StructuralDesignPatterns.Adapter;

//Suppose you are having an IPhone6s and your friend is having an IPhone4s now you went to your friend’s house
// but you forgot to carry your charger with you and you need to charge your phone and the charger you need is not available .
// Now what will you do‍🤷‍♀️? So here in this situation an adapter is going to help us .
// You will use an adapter to charge your IPhone6s from IPhone4s charger .
// So here you have not changed the IPhone4s charger to IPhone6s charger you just adapted the situation and have your work done .

public class MainClass {

    public static void main(String[] args) {
        IPhone6s iPhone6s = new IPhone6s();
        iPhone6s.onCharge();
    }

}
