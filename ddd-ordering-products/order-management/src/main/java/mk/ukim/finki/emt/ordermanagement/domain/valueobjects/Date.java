package mk.ukim.finki.emt.ordermanagement.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

import javax.persistence.Embeddable;


@Embeddable
@Getter
public class Date implements ValueObject {
    private final String date;

    @JsonCreator
    public Date(Date date) {
        this.date = date.toString();
    }

    public Date() {
    this.date="";
    }
}
