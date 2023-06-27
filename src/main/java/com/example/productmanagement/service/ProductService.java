package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        if (product != null) {
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Product updateProduct(long id, Product product) {
        if (product != null) {
            Product product1 = productRepository.getReferenceById(id);
            product1.setName(product.getName());
            product1.setPrice(product.getPrice());
            product1.setUrl(product.getUrl());
            return productRepository.save(product1);
        }
        return null;
    }

    @Override
    public boolean deleteProduct(long id) {
        if (id >= 1) {
            Product product = productRepository.getReferenceById(id);
            productRepository.delete(product);
            return true;
        }
        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getOneProduct(long id) {
        return productRepository.getReferenceById(id);
    }
}
