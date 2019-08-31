package com.gosee.ie.service;

import com.gosee.ie.model.Category;
import com.gosee.ie.repository.CategoryRepository;
import com.gosee.ie.util.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements GenericDAO<Category> {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public List<Category> findAllByIsActive() {
        return categoryRepository.findAllByIsActive();
    }

    @Override
    public Optional<Category> findByIdIsActive(Long id) {
        return categoryRepository.findByIsActive(id);
    }

    @Override
    public Category saveOrUpdate(Category entity) {
        return categoryRepository.save(entity);
    }

    @Override
    public Boolean deleteById(Long id) {
        categoryRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        categoryRepository.deleteByIsActive(id);
        return true;
    }

    public List<Category> findAllSubcategoriesByCategoryId(Long categoryId)
    {
       return categoryRepository.findAllSubcategoriesByCategoryId(categoryId);
    }

    public List<Category> findAllParentCategoriesByIsActive()
    {
        return categoryRepository.findAllParentCategoriesByIsActive();
    }
}
