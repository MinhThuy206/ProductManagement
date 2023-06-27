package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductService {
    public Product addProduct(Product product);

    public Product updateProduct(long id, Product product);

    public boolean deleteProduct(long id);

    public List<Product> getAllProducts();

    public Product getOneProduct(long id);

}
