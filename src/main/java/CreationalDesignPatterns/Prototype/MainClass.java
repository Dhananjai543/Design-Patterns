package CreationalDesignPatterns.Prototype;

public class MainClass {
    public static void main(String[] args) {
        ShapeClient client = new ShapeClient(new Circle("Red"));
        Shape shape = client.createShape();
        shape.draw();

        Shape shape2 = client.createShape();
        shape2.draw();

        System.out.println(shape == shape2);
    }
}
