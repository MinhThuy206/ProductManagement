package com.example.productmanagement.controllers;

import com.example.productmanagement.model.Category;
import com.example.productmanagement.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CateController {
    @Autowired
    private CateService cateService;
    @GetMapping("/")
    public List<Category> getAllCategories() {
        return cateService.getAllCategories();
    }

    // API add product
    @PostMapping("/")
    public Category addCate(@RequestBody Category cate) {
        return cateService.addCategory(cate);
    }

    @GetMapping("/getOneCate")
    public Category geCateDetail(@RequestParam("id") long id) {
        return cateService.getOneCategory(id);
    }


    //update Product
    @PutMapping("/update")
    public Category updateProduct(@RequestParam("id") long id, @RequestBody Category cate) {
        return cateService.updateCategory(id, cate);
    }

    //    API delete product
    @DeleteMapping("/{id}")
    public boolean deleteCate(@PathVariable("id") long id) {
        return cateService.deleteCategory(id);
    }
}
