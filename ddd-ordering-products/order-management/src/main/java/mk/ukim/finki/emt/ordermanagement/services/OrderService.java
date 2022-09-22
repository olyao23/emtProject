package mk.ukim.finki.emt.ordermanagement.services;

import mk.ukim.finki.emt.ordermanagement.domain.exceptions.OrderNotFoundException;
import mk.ukim.finki.emt.ordermanagement.domain.models.Order;
import mk.ukim.finki.emt.ordermanagement.domain.models.OrderId;
import mk.ukim.finki.emt.ordermanagement.domain.models.OrderItemId;
import mk.ukim.finki.emt.ordermanagement.services.form.OrderItemForm;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> findAll();

    Optional<Order> findById(OrderId orderId);

    void addOrder(OrderId orderId, OrderItemForm orderItemForm) throws OrderNotFoundException;

    void deleteOrder(OrderId orderId, OrderItemId orderItemId) throws OrderNotFoundException;
}
