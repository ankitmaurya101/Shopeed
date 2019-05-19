package com.shop.speed.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.speed.model.Product;
import com.shop.speed.service.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	private ProductService pService;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product addProduct(@RequestBody Product product) {
		return pService.addProduct(product);
	}

	@PostMapping(path = "/addAll", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Product> addAllProduct(@RequestBody List<Product> products) {
		return pService.addProducts(products);
	}

	@GetMapping(path = "/getById", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Product> getProductById(@RequestParam Long id) {
		return pService.getProductById(id);
	}

	@GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Product> getProducts() {
		return pService.getAllProduct();
	}

	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product update(@RequestBody Product product) {
		return pService.updateProduct(product);
	}

	@DeleteMapping(path = "/delete")
	public void deleteById(@RequestParam Long id) {
		pService.deleteById(id);
	}
}
