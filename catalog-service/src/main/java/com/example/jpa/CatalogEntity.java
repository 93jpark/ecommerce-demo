package com.example.jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "catalogs")
public class CatalogEntity {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 120, unique = true)
    private String productId;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private Integer stock;
    @Column(nullable = false)
    private Integer unitPrice;

    @Column(nullable = false, updatable = false, insertable = false)
    private Date createdAt;

}
