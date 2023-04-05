import java.util.Scanner;

// Main - ex5
public class CoffeeShop {
    public static void main(String[] args) {
        // Create factories for espresso, latte, and cappuccino
        CoffeeFactory espressoFactory = new EspressoFactory();
        CoffeeFactory latteFactory = new LatteFactory();
        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();

        // customer input
        System.out.println("Welcome to the coffee shop!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String customerName = scanner.nextLine();

        System.out.print("What is your email address? ");
        String customerEmail = scanner.nextLine();

        Order order = new Order(customerName, customerEmail);

        // Create custom coffee using builder
        Coffee customCoffee = new CoffeeBuilder()
                .setDescription("Custom-built Coffee")
                .setCost(4.00)
                .build();

        // Add coffees to order using factory method
        order.addCoffee(espressoFactory.createCoffee());
        order.addCoffee(latteFactory.createCoffee());
        order.addCoffee(cappuccinoFactory.createCoffee());
        order.addCoffee(customCoffee);

        // Calculate total cost of order
        double totalCost = order.getTotalCost();

        // Output order details
        System.out.println("Order #" + order.getOrderNumber() + " for " + order.getCustomerName());
        System.out.println("Email: " + order.getCustomerEmail());
        System.out.println("Items:");
        for (Coffee coffee : order.getCoffees()) {
            System.out.println("- " + coffee.getDescription() + " ($" + coffee.getCost() + ")");
        }
        System.out.println("Total Cost: $" + totalCost);

        // Notify observers of order completion
        OrderObserver emailNotifier = new EmailNotifier();
        emailNotifier.onOrderCompleted(order);
    }
}

