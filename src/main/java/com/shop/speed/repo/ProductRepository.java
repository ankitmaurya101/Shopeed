package com.shop.speed.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shop.speed.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
