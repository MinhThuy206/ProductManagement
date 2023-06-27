package com.example.productmanagement.repository;

import com.example.productmanagement.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManuRepository extends JpaRepository<Manufacturer, Long> {
}
