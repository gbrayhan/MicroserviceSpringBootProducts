package com.springapp.serviceproducts.service;

import com.springapp.serviceproducts.entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public Product findById(Long id);
    public Product createProduct(Product product);
}
