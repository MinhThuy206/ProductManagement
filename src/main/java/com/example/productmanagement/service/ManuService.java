package com.example.productmanagement.service;

import com.example.productmanagement.model.Manufacturer;
import com.example.productmanagement.repository.ManuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ManuService implements IManuService {
    @Autowired
    private ManuRepository manuRepository;

    @Override
    public Manufacturer addManu(Manufacturer manu) {
        if (manu != null) {
            return manuRepository.save(manu);
        }
        return null;
    }

    @Override
    public Manufacturer updateManu(long id, Manufacturer manu) {
        Manufacturer manufacturer = manuRepository.getReferenceById(id);
        manufacturer.setName(manu.getName());
        manufacturer.setAddress(manu.getAddress());
        return manuRepository.save(manufacturer);
    }

    @Override
    public boolean deleteManu(long id) {
        if (id >= 1) {
            Manufacturer manu = manuRepository.getReferenceById(id);
            manuRepository.delete(manu);
            return true;
        }
        return false;
    }

    @Override
    public List<Manufacturer> getAllManu() {
        return manuRepository.findAll();
    }

    @Override
    public Manufacturer getOneManu(long id) {
        return manuRepository.getReferenceById(id);
    }
}
