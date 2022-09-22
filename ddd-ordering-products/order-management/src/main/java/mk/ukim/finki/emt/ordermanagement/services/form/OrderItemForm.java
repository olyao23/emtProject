package mk.ukim.finki.emt.ordermanagement.services.form;


import lombok.Data;
import mk.ukim.finki.emt.ordermanagement.domain.valueobjects.Product;
import javax.validation.constraints.NotNull;

@Data
public class OrderItemForm {

    @NotNull
    private Product product;

}
