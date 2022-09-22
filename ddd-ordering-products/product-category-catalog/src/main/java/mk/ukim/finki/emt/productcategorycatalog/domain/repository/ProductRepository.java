package mk.ukim.finki.emt.productcategorycatalog.domain.repository;

import mk.ukim.finki.emt.productcategorycatalog.domain.models.Product;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductId> {
}
