package mk.ukim.finki.emt.productcategorycatalog.services;

import mk.ukim.finki.emt.productcategorycatalog.domain.exceptions.CategoryNotFoundException;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.Category;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.CategoryId;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();

    Category findById(CategoryId categoryId) throws CategoryNotFoundException;

    Category addCategory(CategoryId categoryId) throws CategoryNotFoundException;

    Category deleteCategory(CategoryId orderId) throws CategoryNotFoundException;
}
