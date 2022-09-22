package mk.ukim.finki.emt.productcategorycatalog.config;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.Product;
import mk.ukim.finki.emt.productcategorycatalog.domain.repository.ProductRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final ProductRepository productRepository;

    @PostConstruct
    public void initData() {
        Product product1 = Product.build("Running Shoes", 50D);
        Product product2 = Product.build("Shirt", 150D);
        Product product3 = Product.build("Trousers", 170D);
        Product product4 = Product.build("Jacket", 250D);
        Product product5 = Product.build("Jeans", 150D);

        if(this.productRepository.findAll().isEmpty()) {
            this.productRepository.saveAll(Arrays.asList(product1,product2,product3,product4,product5));
        }

    }

}
