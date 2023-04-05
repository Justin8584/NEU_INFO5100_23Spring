// Creational Pattern interface - Factory Method pattern (Coffee Factory)
public interface CoffeeFactory {
    Coffee createCoffee();
}

// Concrete Creators
class EspressoFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new Espresso();
    }
}

class LatteFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new Latte();
    }
}

class CappuccinoFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}

