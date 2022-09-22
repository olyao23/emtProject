package mk.ukim.finki.emt.productcategorycatalog.domain.exceptions;

public class CategoryNotFoundException extends Exception {
    public CategoryNotFoundException() {
        super("Category not found");
    }
}
