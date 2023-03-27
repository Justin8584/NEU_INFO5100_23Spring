public class Ex2 {  // Advanced Java OOP
    public static void main(String[] args) {

        Shape.color = "red";

        // create Triangle
        Triangle triangle1 = new Triangle(13.43, 21.22, 17.89);
        triangle1.calculateArea();
        triangle1.calculatePerimeter();

        System.out.println("\nThe Area of the triangle is " + triangle1.calculateArea());
        System.out.println("The Perimeter of the triangle is " + triangle1.calculatePerimeter());

        // create Rectangle
        Rectangle rectangle1 = new Rectangle(20.0, 17.0);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println("\nThe Area of the rectangle is " + rectangle1.calculateArea());
        System.out.println("The Perimeter of the rectangle is " + rectangle1.calculatePerimeter());

        // create Circle
        Circle circle1 = new Circle(15.55);
        circle1.calculateArea();
        circle1.calculatePerimeter();

        System.out.println("\nThe Area of the Circle is " + circle1.calculateArea());
        System.out.println("The Perimeter of the Circle is " + circle1.calculatePerimeter());

        // create Square
        Square square1 = new Square(25.0);
        square1.calculateArea();
        square1.calculatePerimeter();

        System.out.println("\nThe Area of the square is " + square1.calculateArea());
        System.out.println("The Perimeter of the square is " + square1.calculatePerimeter());

    }
}
