package com.epam.docker.course;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.docker.course.model.ProdReviews;
import com.epam.docker.course.model.Product;
import com.epam.docker.course.service.ProdService;

@RestController
@RequestMapping("/api")
public class ProdController {
	
	private static Logger log = LoggerFactory.getLogger(ProdController.class);
	
	@Autowired
	private ProdService prodService;
	
	@Autowired
	private ProdReviewClient feignProxy;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return prodService.getProducts();
	}
	
	@GetMapping("/products/{id}")
	public Optional<Product> getAllProduct(@PathVariable long id) {
		Optional<Product> product = prodService.getProduct(id);
		List<ProdReviews> review = feignProxy.getReviews(id);
		log.error("This Product review from feign -> ::" + review.toString());		
		product.get().setProdReviews(review);		
		return product;
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> saveProducts(@RequestBody Product product) {
		return ResponseEntity.ok(prodService.saveProduct(product));
	}

}
