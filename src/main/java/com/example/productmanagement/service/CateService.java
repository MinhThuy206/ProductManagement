package com.example.productmanagement.service;

import com.example.productmanagement.model.Category;
import com.example.productmanagement.repository.CateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateService implements ICateService {
    @Autowired
    private CateRepository cateRepository;

    @Override
    public Category addCategory(Category cate) {
        if (cate != null) {
            return cateRepository.save(cate);
        }
        return null;
    }

    @Override
    public Category updateCategory(long id, Category cate) {
        Category category = cateRepository.getReferenceById(id);
        category.setName(cate.getName());
        return cateRepository.save(category);
    }

    @Override
    public boolean deleteCategory(long id) {
        if (id >= 1) {
            Category cate = cateRepository.getReferenceById(id);
            cateRepository.delete(cate);
            return true;
        }
        return false;
    }

    @Override
    public List<Category> getAllCategories() {
        return cateRepository.findAll();
    }

    @Override
    public Category getOneCategory(long id) {
        return cateRepository.getReferenceById(id);
    }
}
