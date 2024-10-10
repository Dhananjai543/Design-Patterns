package CreationalDesignPatterns.Singleton;

public class MainClass {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
//        singleton.printMessage(); // Access via Class reference, because printMessage() is a static method
        Singleton.printMessage();

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2); // true
    }
}
