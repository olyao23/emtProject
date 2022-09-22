package mk.ukim.finki.emt.productcategorycatalog.domain.models;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class ProductId extends DomainObjectId {

    private ProductId() {
        super(ProductId.randomId(ProductId.class).getId());
    }

    public ProductId( String uuid) {
        super(uuid);
    }

    public static ProductId of(@NonNull String uuid) {
        ProductId product = new ProductId(uuid);
        return product;
    }


}
