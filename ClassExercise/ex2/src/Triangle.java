public class Triangle extends Shape {

    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double halfPer = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

}
