
package com.epam.docker.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.docker.course.model.Product;
import com.epam.docker.course.repo.ProdRepository;

@Service
public class ProdServiceImpl implements  ProdService{
	
	@Autowired
	private ProdRepository repo;

	@Override
	public List<Product> getProducts() {
		return repo.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		repo.save(product);
		return product;
	}

	@Override
	public Optional<Product> getProduct(long id) {
		return repo.findById(id);
	}

}
