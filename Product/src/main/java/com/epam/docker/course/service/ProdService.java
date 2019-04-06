package com.epam.docker.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.epam.docker.course.model.Product;

@Service
public interface ProdService {
	
	public List<Product> getProducts();
	public Product saveProduct(Product product);
	public Optional<Product> getProduct(long id);

}
