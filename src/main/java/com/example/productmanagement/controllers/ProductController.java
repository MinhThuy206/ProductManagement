package com.example.productmanagement.controllers;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")

public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // API add product
    @PostMapping("/")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/getOneProduct")
    public Product getProductDetail(@RequestParam("id") long id) {
        return productService.getOneProduct(id);
    }

    //update Product
    @PutMapping("/update")
    public Product updateProduct(@RequestParam("id") long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    //    API delete product
    @DeleteMapping("/{id}")
    public boolean deleteProduct(@PathVariable("id") long id) {
        return productService.deleteProduct(id);
    }
}
