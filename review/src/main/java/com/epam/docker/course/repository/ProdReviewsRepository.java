package com.epam.docker.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.docker.course.model.ProdReviews;

@Repository
public interface ProdReviewsRepository extends JpaRepository<ProdReviews,Long> {
	
	List<ProdReviews> findByProdId(Long Id);

}
