import java.util.ArrayList;

// Order class
public class Order {
    private static int nextOrderNumber = 1;
    private int orderNumber;
    private String customerName;
    private String customerEmail;
    private ArrayList<Coffee> coffees;

    public Order(String customerName, String customerEmail) {
        this.orderNumber = nextOrderNumber++;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.coffees = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void addCoffee(Coffee coffee) {
        coffees.add(coffee);
    }

    public ArrayList<Coffee> getCoffees() {
        return coffees;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Coffee coffee : coffees) {
            totalCost += coffee.getCost();
        }
        return totalCost;
    }
}
