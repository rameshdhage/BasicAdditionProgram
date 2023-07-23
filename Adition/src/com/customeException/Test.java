package com.customeException;

public class Test {

	public static void main(String[] args) {
		Account accc=new Account();
		
		accc.withdrawal(6000);
			System.out.println("After remaining balance>>>"+accc.getBlance());
		

	}

}
