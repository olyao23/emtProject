package mk.ukim.finki.emt.productcategorycatalog.domain.models;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class CategoryId extends DomainObjectId {

    private CategoryId() {
        super(CategoryId.randomId(CategoryId.class).getId());
    }

    public CategoryId(@NonNull String uuid) {
        super(uuid);
    }

}
