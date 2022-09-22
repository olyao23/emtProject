package mk.ukim.finki.emt.ordermanagement.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Getter
public class Product implements ValueObject {

    private final ProductId id;
    private final String name;
    private final Double price;

    private Product() {
        this.id = ProductId.randomId(ProductId.class);
        this.name = "";
        this.price = 0D;
    }

    @JsonCreator
    public Product(@JsonProperty("id") ProductId id,
                   @JsonProperty("productName") String name,
                   @JsonProperty("price") Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
