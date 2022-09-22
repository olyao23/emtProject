package mk.ukim.finki.emt.productcategorycatalog.services.impl;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcategorycatalog.domain.exceptions.ProductNotFoundException;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.Product;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.ProductId;
import mk.ukim.finki.emt.productcategorycatalog.domain.repository.ProductRepository;
import mk.ukim.finki.emt.productcategorycatalog.services.ProductService;
import mk.ukim.finki.emt.productcategorycatalog.services.form.ProductForm;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(ProductId productId) throws ProductNotFoundException {
        return this.productRepository.findById(productId).orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public Product createProduct(ProductForm form) {
        Product product = Product.build(form.getName(), form.getPrice());
        this.productRepository.save(product);
        return product;
    }


    @Override
    public Product addProduct(ProductId productId) throws ProductNotFoundException {
        Product product = this.productRepository.findById(productId).orElseThrow(ProductNotFoundException::new);
        this.productRepository.saveAndFlush(product);
        return product;
    }

    @Override
    public Product deleteProduct(ProductId productId) throws ProductNotFoundException {
        Product product = this.productRepository.findById(productId).orElseThrow(ProductNotFoundException::new);
        this.productRepository.saveAndFlush(product);
        return product;
    }
}
