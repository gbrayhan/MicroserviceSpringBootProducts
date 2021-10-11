package com.springapp.serviceproducts.models.service;

import com.springapp.serviceproducts.models.entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public Product findById(Long id);
    public Product createProduct(Product product);
}
