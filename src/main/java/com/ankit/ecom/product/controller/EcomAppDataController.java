package com.ankit.ecom.product.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ankit.ecom.product.entity.Product;
import com.ankit.ecom.product.service.EcomDataService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EcomAppDataController {

	@Autowired
	private EcomDataService ProductService;

	@GetMapping("/products")
	public List<Product> getProducts() {
		return ProductService.findAll();
	}

	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable long id) {
		return ProductService.findById(id);
	}

	@DeleteMapping("/products/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
		ProductService.deleteById(id);
		;
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
		Product newProduct = ProductService.updateProduct(product);
		return new ResponseEntity<Product>(newProduct, HttpStatus.OK);
	}

	@PostMapping("/products")
	public ResponseEntity<Void> createProduct(@RequestBody Product product) {
		System.out.println(product);
		Product createdProduct = ProductService.updateProduct(product);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdProduct.getId())
				.toUri();
		return ResponseEntity.created(uri).build();

	}
}
