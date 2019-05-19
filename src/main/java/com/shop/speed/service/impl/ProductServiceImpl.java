package com.shop.speed.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.shop.speed.model.Product;
import com.shop.speed.repo.ProductRepository;
import com.shop.speed.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public ArrayList<Product> addProducts(List<Product> products) {
		return Lists.newArrayList(productRepository.saveAll(products));
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public ArrayList<Product> getAllProduct() {
		return Lists.newArrayList(productRepository.findAll());
	}

	@Override
	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}
}
