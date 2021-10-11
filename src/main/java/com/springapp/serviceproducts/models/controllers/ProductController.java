package com.springapp.serviceproducts.models.controllers;


import com.springapp.serviceproducts.models.entity.Product;
import com.springapp.serviceproducts.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/product")
    public List<Product> list() {
        return productService.findAll();
    }


    @GetMapping("/product/{id}")
    public Product details(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

}
