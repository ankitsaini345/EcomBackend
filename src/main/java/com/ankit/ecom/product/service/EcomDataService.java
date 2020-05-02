package com.ankit.ecom.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.ecom.product.entity.Product;
import com.ankit.ecom.product.repository.ProductRepository;

@Service
public class EcomDataService {

//	private static final Logger log = LoggerFactory.getLogger(EcomDataService.class);

	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}

	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}

	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

}
