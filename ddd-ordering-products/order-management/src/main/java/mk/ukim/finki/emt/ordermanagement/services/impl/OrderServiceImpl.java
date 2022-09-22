package mk.ukim.finki.emt.ordermanagement.services.impl;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.ordermanagement.domain.exceptions.OrderNotFoundException;
import mk.ukim.finki.emt.ordermanagement.domain.models.Order;
import mk.ukim.finki.emt.ordermanagement.domain.models.OrderId;
import mk.ukim.finki.emt.ordermanagement.domain.models.OrderItemId;
import mk.ukim.finki.emt.ordermanagement.domain.repository.OrderRepository;
import mk.ukim.finki.emt.ordermanagement.services.OrderService;
import mk.ukim.finki.emt.ordermanagement.services.form.OrderForm;
import mk.ukim.finki.emt.ordermanagement.services.form.OrderItemForm;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;


    @Override
    public List<Order> findAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(OrderId id) {
        return this.orderRepository.findById(id);
    }

    @Override
    public void addOrder(OrderId orderId, OrderItemForm orderItemForm) throws OrderNotFoundException {
        Order order = this.orderRepository.findById(orderId).orElseThrow(OrderNotFoundException::new);
        order.addOrder(orderItemForm.getProduct());
        orderRepository.saveAndFlush(order);
    }

    @Override
    public void deleteOrder(OrderId orderId, OrderItemId orderItemId) throws OrderNotFoundException {
        Order order = this.orderRepository.findById(orderId).orElseThrow(OrderNotFoundException::new);
        order.removeOrder(orderItemId);
        orderRepository.saveAndFlush(order);
    }

    private Order toDomainObject(OrderForm orderForm) {
        var order = new Order();
        orderForm.getItems().forEach(item->order.addOrder(item.getProduct()));
        return order;
    }


}
