package com.springapp.serviceproducts.repository;

import com.springapp.serviceproducts.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {


}
