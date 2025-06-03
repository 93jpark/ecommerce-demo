package com.example.service;

import com.example.jpa.CatalogEntity;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();

}
