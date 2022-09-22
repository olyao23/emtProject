package mk.ukim.finki.emt.sharedkernel.domain.events.allEvents;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

@Getter
public class UserOrderingProducts extends DomainEvent {
    public UserOrderingProducts(String topic) {
        super(topic);
    }
}
