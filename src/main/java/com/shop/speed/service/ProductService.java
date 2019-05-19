package com.shop.speed.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shop.speed.model.Product;

public interface ProductService {

	Product addProduct(Product product);

	ArrayList<Product> addProducts(List<Product> products);

	Product updateProduct(Product product);

	Optional<Product> getProductById(Long id);

	ArrayList<Product> getAllProduct();

	void deleteById(Long id);

}