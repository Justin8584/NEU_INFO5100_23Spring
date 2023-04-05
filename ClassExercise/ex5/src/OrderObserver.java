// Behavioral Pattern interface - Observer pattern (notice customers when order is ready)
public interface OrderObserver {
    void onOrderCompleted(Order order);
}

// Observer implementation
class EmailNotifier implements OrderObserver {
    public void onOrderCompleted(Order order) {
        System.out.println("Order #" + order.getOrderNumber() + " has been completed.");
        System.out.println("Sending email notification to " + order.getCustomerEmail() + "... and Enjoy!");
    }
}
