package com.example.productmanagement.service;

import com.example.productmanagement.model.Manufacturer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IManuService {
    public Manufacturer addManu(Manufacturer manu);

    public Manufacturer updateManu(long id, Manufacturer manu);

    public boolean deleteManu(long id);

    public List<Manufacturer> getAllManu();

    public Manufacturer getOneManu(long id);
}
