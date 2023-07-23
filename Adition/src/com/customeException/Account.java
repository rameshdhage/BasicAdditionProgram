package com.customeException;

public class Account {
	
	private int balance=5000;
	
	public int getBlance() {
		return this.balance;
	}
	public void  withdrawal(int amount) {
		if(amount>balance) {
			throw new InsufficientFundException("sorry insufficientfund In your account");
		}
		else {
		balance	=balance-amount;
		
		
		}
	}
		
}
