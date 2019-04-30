package com.epam.docker.course;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	@GetMapping("/prodReviews")
	public ResponseEntity<ProdReviews> getProdReviews() {
		return ResponseEntity.ok(myReviews());
	}

	private static ProdReviews myReviews() {
		ProdReviews obj = new ProdReviews();
		obj.setId(1);
		obj.setReview("product is very good");
		obj.setProdRank(1);
		obj.setId(1);
		obj.setComments("Good cjoice to buy");
		return obj;
	}

}
