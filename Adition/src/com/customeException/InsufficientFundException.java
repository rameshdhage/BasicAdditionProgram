package com.customeException;

public class InsufficientFundException extends RuntimeException {
	
   private  String massage;
  
  public  InsufficientFundException(String massage) {
	  
	  super(massage);
  }
	
	
	
	

}
