package com.springapp.serviceproducts.models.repository;

import com.springapp.serviceproducts.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {


}
