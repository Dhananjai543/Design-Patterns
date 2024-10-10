package CreationalDesignPatterns.Prototype;

public class Circle implements Shape {

    String color;

    public Circle(String color) {
        this.color = color;
    }
    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with color: " + this.color);
    }
}
