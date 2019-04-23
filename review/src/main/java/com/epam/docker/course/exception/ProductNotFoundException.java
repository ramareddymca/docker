package com.epam.docker.course.exception;

import com.epam.docker.course.model.ProdReviews;

public class ProductNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException() {
		
	}

	public ProductNotFoundException(String errMsg) {
		super(errMsg);
	}
	
	public ProdReviews buildErr(String errMsg) {		
		ProdReviews prdErrMsg = new ProdReviews();
		prdErrMsg.setComments(errMsg);		
		return prdErrMsg;			
	}
	
	public ProdReviews buildErr(long prodId,String errMsg) {		
		ProdReviews prdErrMsg = new ProdReviews();
		prdErrMsg.setComments(errMsg);
		prdErrMsg.setProdId(prodId);
		return prdErrMsg;			
	}

}
