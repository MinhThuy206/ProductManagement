package com.example.productmanagement.service;

import com.example.productmanagement.model.Batch;
import com.example.productmanagement.repository.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchService implements IBatchService {
    @Autowired
    private BatchRepository batchRepository;

    @Override
    public Batch addBatch(Batch batch) {
        if (batch != null) {
            return batchRepository.save(batch);
        }
        return null;
    }

    @Override
    public Batch updateBatch(long id, Batch batch) {
        Batch batch1 = batchRepository.getReferenceById(id);
        batch1.setHSD(batch.getHSD());
        batch1.setNSX(batch.getNSX());
        return batchRepository.save(batch1);
    }

    @Override
    public boolean deleteBatch(long id) {
        if (id >= 1) {
            Batch batch = batchRepository.getReferenceById(id);
            batchRepository.delete(batch);
            return true;
        }
        return false;
    }

    @Override
    public List<Batch> getAllBath() {
        return batchRepository.findAll();
    }

    @Override
    public Batch getOneBatch(long id) {
        return batchRepository.getReferenceById(id);
    }
}
