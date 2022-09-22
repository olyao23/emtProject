package mk.ukim.finki.emt.ordermanagement.domain.exceptions;

public class OrderItemNotFoundException extends Exception {

    public OrderItemNotFoundException() {
        super("Order item not found");
    }
}
