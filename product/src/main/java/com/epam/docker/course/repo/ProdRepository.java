package com.epam.docker.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.docker.course.model.Product;

@Repository
public interface ProdRepository extends JpaRepository<Product, Long> {

}
