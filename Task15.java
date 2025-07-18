// Define the Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Abstract class implementing Shape
abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // The abstract class leaves calculation to subclasses unless it can be shared
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle class
class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, radius, radius); // length and width are both radius for reference
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the implementation
public class Task15 {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
// This code defines an interface `Shape` and an abstract class `AbstractShape` that implements the interface.
// The `Circle` and `Rectangle` classes extend the abstract class and provide implementations for calculating
// area and perimeter. The `Task15` class contains the main method to test the functionality of the shapes.
// The code demonstrates polymorphism by using the `Shape` interface type to refer to different shape objects.
// The `AbstractShape` class provides a common structure for the shapes, while allowing subclasses to define specific behaviors for area and perimeter calculations. This design promotes code reuse and flexibility in extending the shape functionality in the future. The main method creates instances of `Circle` and `Rectangle`,