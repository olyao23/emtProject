package mk.ukim.finki.emt.productcategorycatalog.domain.models;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "product")
public class Product extends AbstractEntity<ProductId> {

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(name = "product_price", nullable = false)
    private Double price;


    public Product() {
        super(DomainObjectId.randomId(ProductId.class));
    }

    public static Product build(String name, Double price) {
        Product product = new Product();
        product.name = name;
        product.price = price;
        return product;
    }


}
