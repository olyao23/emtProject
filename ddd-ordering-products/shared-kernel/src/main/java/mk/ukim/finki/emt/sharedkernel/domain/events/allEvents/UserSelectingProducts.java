package mk.ukim.finki.emt.sharedkernel.domain.events.allEvents;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

@Getter
public class UserSelectingProducts extends DomainEvent {
    public UserSelectingProducts(String topic) {
        super(topic);
    }
}
