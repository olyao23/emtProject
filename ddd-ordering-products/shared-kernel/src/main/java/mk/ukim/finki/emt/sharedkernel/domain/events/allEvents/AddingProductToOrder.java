package mk.ukim.finki.emt.sharedkernel.domain.events.allEvents;


import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

@Getter
public class AddingProductToOrder extends DomainEvent {
    public AddingProductToOrder(String topic) {
        super(topic);
    }
}
