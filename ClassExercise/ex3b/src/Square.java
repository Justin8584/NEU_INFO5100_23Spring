import java.io.Serial;

class Square extends Shape {
    @Serial
    private static final long serialVersionUID = 5L;
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}