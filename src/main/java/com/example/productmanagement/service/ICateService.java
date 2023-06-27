package com.example.productmanagement.service;

import com.example.productmanagement.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICateService  {
    public Category addCategory(Category cate);

    public Category updateCategory(long id, Category cate);

    public boolean deleteCategory(long id);

    public List<Category> getAllCategories();

    public Category getOneCategory(long id);

}
