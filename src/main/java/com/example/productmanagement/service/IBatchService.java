package com.example.productmanagement.service;

import com.example.productmanagement.model.Batch;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBatchService {
    public Batch addBatch(Batch batch);

    public Batch updateBatch(long id, Batch batch);

    public boolean deleteBatch(long id);

    public List<Batch> getAllBath();

    public Batch getOneBatch(long id);
}
