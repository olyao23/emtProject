package mk.ukim.finki.emt.ordermanagement.domain.models;

import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.ordermanagement.domain.valueobjects.Date;
import mk.ukim.finki.emt.ordermanagement.domain.valueobjects.Product;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Table(name="orders")
public class Order extends AbstractEntity<OrderId> {

    @Column(name="order_date", nullable = false)
    private Date date;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<OrderItem> orderItemList = new HashSet<>();

    public Order() {
        super(OrderId.randomId(OrderId.class));
    }

    public OrderItem addOrder(@NonNull Product product) {
        Objects.requireNonNull(product,"product can't be null");
        var item  = new OrderItem(product.getId());
        orderItemList.add(item);
        return item;
    }

    public void removeOrder(@NonNull OrderItemId orderItemId) {
        Objects.requireNonNull(orderItemId,"Order Item can't be null");
        orderItemList.removeIf(v->v.getProductId().equals(orderItemId));
    }



}
