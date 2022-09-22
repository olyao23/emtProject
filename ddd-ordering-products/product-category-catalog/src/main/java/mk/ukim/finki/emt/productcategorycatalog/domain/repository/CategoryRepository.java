package mk.ukim.finki.emt.productcategorycatalog.domain.repository;

import mk.ukim.finki.emt.productcategorycatalog.domain.models.Category;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.CategoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, CategoryId> {
}
