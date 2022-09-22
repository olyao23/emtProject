package mk.ukim.finki.emt.productcategorycatalog.services.form;

import lombok.Data;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.Product;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryForm {

    @Valid
    @NotEmpty
    private List<Product> productList = new ArrayList<>();

}
