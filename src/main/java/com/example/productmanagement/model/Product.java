package com.example.productmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")

    private String name;

    @Column(name = "price")

    private Double price;

    @Column(name = "URL")
    private String url;

    @ManyToOne
    Category category;

    @ManyToOne
    Manufacturer manufacturer;

    @OneToMany
    ArrayList<Batch> batches;

}