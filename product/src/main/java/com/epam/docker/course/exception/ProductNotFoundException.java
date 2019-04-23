package com.epam.docker.course.exception;

import com.epam.docker.course.model.Product;

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
	
	public Product buildErr(String errMsg) {		
		Product prdErrMsg = new Product();
		prdErrMsg.setProdInfo(errMsg);		
		return prdErrMsg;			
	}
	
	public Product buildErr(long prodId,String errMsg) {		
		Product prdErrMsg = new Product();
		prdErrMsg.setProdInfo(errMsg);
		prdErrMsg.setProdId(prodId);
		return prdErrMsg;			
	}

}
