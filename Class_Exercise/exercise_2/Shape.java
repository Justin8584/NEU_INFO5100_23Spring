public abstract class Shape {

    static String color;

    public Shape() {

    }

    public Shape(String color) {
        Shape.color = color;
    }

    // abstract method, calculate the area of the shape
    public abstract double calculateArea();

    // abstract method, calculate the perimeter of the shape
    public abstract double calculatePerimeter();

    public static String getColor() {
        return Shape.color;
    }
}