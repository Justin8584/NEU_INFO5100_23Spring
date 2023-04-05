// Creational Pattern - Builder pattern (CoffeeBuilder for customer-built coffee)
public class CoffeeBuilder {
    private String description;
    private double cost;

    public CoffeeBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public CoffeeBuilder setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public Coffee build() {
        return new CustomCoffee(description, cost);
    }
}
