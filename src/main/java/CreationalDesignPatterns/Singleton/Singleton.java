package CreationalDesignPatterns.Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    static void printMessage() {
        System.out.println("Hello, World!");
    }
}
