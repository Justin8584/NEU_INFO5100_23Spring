import java.io.Serial;
import java.io.Serializable;

abstract class Shape implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }
}