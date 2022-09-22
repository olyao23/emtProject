package mk.ukim.finki.emt.productcategorycatalog.domain.models;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Table(name = "productcategories")
public class Category extends AbstractEntity<CategoryId> {

    @Column(name = "category_name", nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Product> products = new HashSet<>();

    public Category() {
        super(DomainObjectId.randomId(CategoryId.class));
    }

    public static Category build(String name) {
        Category category = new Category();
        category.name = name;
        return category;
    }
}
