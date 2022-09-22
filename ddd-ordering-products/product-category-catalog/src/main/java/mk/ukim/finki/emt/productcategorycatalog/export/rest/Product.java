package mk.ukim.finki.emt.productcategorycatalog.export.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcategorycatalog.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class Product {
    private final ProductService productService;

    @GetMapping
    public List<mk.ukim.finki.emt.productcategorycatalog.domain.models.Product> findAll() {
        return productService.findAll();
    }

}
