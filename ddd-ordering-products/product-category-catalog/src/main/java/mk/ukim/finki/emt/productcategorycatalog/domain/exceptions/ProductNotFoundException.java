package mk.ukim.finki.emt.productcategorycatalog.domain.exceptions;

public class ProductNotFoundException extends Exception {

    public ProductNotFoundException() {
        super("Product not found");
    }
}
