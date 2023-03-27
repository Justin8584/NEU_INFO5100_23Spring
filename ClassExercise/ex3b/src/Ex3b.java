public class Ex3b {  // Serialization
    public static void main(String[] args) {
        // create some shapes
        Shape triangle = new Triangle("red", 3, 4, 5, 5, 5);
        Shape rectangle = new Rectangle("green", 5, 6);
        Shape circle = new Circle("blue", 2.5);
        Shape square = new Square("yellow", 4);

        // demonstrate polymorphism and abstraction
        Shape[] shapes = new Shape[] { triangle, rectangle, circle, square };
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }

        // demonstrate overriding
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // demonstrate static field
        System.out.println("Shape Color: " + Shape.class.getSimpleName());
    }
}