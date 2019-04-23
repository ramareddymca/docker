package com.epam.docker.course;

import java.util.List;

import org.springframework.stereotype.Component;

import com.epam.docker.course.helper.ProductHelper;
import com.epam.docker.course.model.ProdReviews;



@Component
public class ProdReviewClientFallback implements ProdReviewClient {

	@Override
	public List<ProdReviews> getReviews(long Id) {
		return ProductHelper.fallBackReviewsErrMsg();
	}

	/*@Override
	public ProdReviews saveProdReview(ProdReviews reviews) {				
		return ProductHelper.fallBackReviewsErrMsg().get(0);
	}*/

}
