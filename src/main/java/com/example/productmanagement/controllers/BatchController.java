package com.example.productmanagement.controllers;

import com.example.productmanagement.model.Batch;
import com.example.productmanagement.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batch")
public class BatchController {
    @Autowired
    private BatchService batchService;

    @GetMapping("/")
    public List<Batch> getAllBatch() {
        return batchService.getAllBath();
    }

    @GetMapping("/getOneBatch")
    public Batch getOneBatch(@RequestParam("id") long id) {
        return batchService.getOneBatch(id);
    }

    @PostMapping("/")
    public Batch addBatch(@RequestBody Batch batch) {
        return batchService.addBatch(batch);
    }

    @PutMapping("/update")
    public Batch updateBatch(@RequestParam("id") long id, @RequestBody Batch batch) {
        return batchService.updateBatch(id, batch);
    }

    @DeleteMapping("/delete")
    public boolean deleteBatch(@PathVariable("id") long id) {
        return batchService.deleteBatch(id);
    }
}
