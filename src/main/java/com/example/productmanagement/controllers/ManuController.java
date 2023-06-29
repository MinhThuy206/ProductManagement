package com.example.productmanagement.controllers;

import com.example.productmanagement.model.Category;
import com.example.productmanagement.model.Manufacturer;
import com.example.productmanagement.service.ManuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manu")
public class ManuController {
    @Autowired
    private ManuService manuService;

    @GetMapping("/")
    public List<Manufacturer> getAllCategories() {
        return manuService.getAllManu();
    }

    // API add product
    @PostMapping("/")
    public Manufacturer addManu(@RequestBody Manufacturer manu) {
        return manuService.addManu(manu);
    }

    @GetMapping("/getOneManu")
    public Manufacturer geManuDetail(@RequestParam("id") long id) {
        return manuService.getOneManu(id);
    }


    //update Product
    @PutMapping("/update")
    public Manufacturer updateManu(@RequestParam("id") long id, @RequestBody Manufacturer manu) {
        return manuService.updateManu(id, manu);
    }

    //    API delete product
    @DeleteMapping("/{id}")
    public boolean deletManu(@PathVariable("id") long id) {
        return manuService.deleteManu(id);
    }
}
