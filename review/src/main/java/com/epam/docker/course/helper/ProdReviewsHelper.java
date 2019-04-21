package com.epam.docker.course.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.epam.docker.course.attributes.ProductCodes;
import com.epam.docker.course.exception.ProductNotFoundException;
import com.epam.docker.course.model.ProdReviews;


public class ProdReviewsHelper {

	public static Optional<ProdReviews> buildErrMsg(String errMsg) {
		return Optional.of(new ProductNotFoundException().buildErr(errMsg));
	}

	public static Optional<ProdReviews> buildErrMsg(long prodId, String errMsg) {

		return Optional.of(new ProductNotFoundException().buildErr(prodId, errMsg));
	}

	public static List<ProdReviews> buildErrMsg() {	
		List<ProdReviews> noData = new ArrayList<ProdReviews>(1);
		noData.add(new ProductNotFoundException().buildErr(ProductCodes.PRODS_NOT_AVAIL));
		return noData;
	}

}
