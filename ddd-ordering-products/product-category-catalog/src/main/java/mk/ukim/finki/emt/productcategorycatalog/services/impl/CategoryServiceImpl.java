package mk.ukim.finki.emt.productcategorycatalog.services.impl;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcategorycatalog.domain.exceptions.CategoryNotFoundException;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.Category;
import mk.ukim.finki.emt.productcategorycatalog.domain.models.CategoryId;
import mk.ukim.finki.emt.productcategorycatalog.domain.repository.CategoryRepository;
import mk.ukim.finki.emt.productcategorycatalog.services.CategoryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }

    @Override
    public Category findById(CategoryId categoryId) throws CategoryNotFoundException {
        return this.categoryRepository.findById(categoryId).orElseThrow(CategoryNotFoundException::new);
    }

    @Override
    public Category addCategory(CategoryId categoryId) throws CategoryNotFoundException {
        Category category = this.categoryRepository.findById(categoryId).orElseThrow(CategoryNotFoundException::new);
        this.categoryRepository.saveAndFlush(category);
        return category;
    }

    @Override
    public Category deleteCategory(CategoryId categoryId) throws CategoryNotFoundException {
        Category category = this.categoryRepository.findById(categoryId).orElseThrow(CategoryNotFoundException::new);
        this.categoryRepository.saveAndFlush(category);
        return category;
    }
}
