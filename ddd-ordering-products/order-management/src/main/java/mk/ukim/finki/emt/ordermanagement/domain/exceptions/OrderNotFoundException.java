package mk.ukim.finki.emt.ordermanagement.domain.exceptions;

public class OrderNotFoundException extends Exception {
    public OrderNotFoundException() {
        super("Order not found");
    }
}
