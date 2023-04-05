// Coffee Product interface
public interface Coffee {
    String getDescription();

    double getCost();
}

// Coffee Products, (Espresso, Latte, Cappuccino)
class Espresso implements Coffee {
    public String getDescription() {
        return "Espresso";
    }
    public double getCost() {
        return 2.50;
    }
}

class Latte implements Coffee {
    public String getDescription() {
        return "Latte";
    }
    public double getCost() {
        return 3.00;
    }
}

class Cappuccino implements Coffee {
    public String getDescription() {
        return "Cappuccino";
    }
    public double getCost() {
        return 3.50;
    }
}

// Custom Product
class CustomCoffee implements Coffee {
    private String description;
    private double cost;

    public CustomCoffee(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
