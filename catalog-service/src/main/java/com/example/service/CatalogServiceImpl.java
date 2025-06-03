package com.example.service;

import com.example.jpa.CatalogEntity;
import com.example.repository.CatalogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository categoryRepository;
    private final Environment env;

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return categoryRepository.findAll();
    }

}
