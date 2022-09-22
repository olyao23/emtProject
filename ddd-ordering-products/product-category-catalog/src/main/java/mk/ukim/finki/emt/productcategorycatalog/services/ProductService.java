package mk.ukim.finki.emt.productcategorycatalog.services;

import mk.ukim.finki.emt.productcategorycatalog.domain.exceptions.ProductNotFoundException;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.Product;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.ProductId;
import mk.ukim.finki.emt.productcategorycatalog.services.form.ProductForm;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Product createProduct(ProductForm form);

    Product findById(ProductId productId) throws ProductNotFoundException;

    Product addProduct(ProductId productId) throws ProductNotFoundException;

    Product deleteProduct(ProductId productId) throws ProductNotFoundException;
}
