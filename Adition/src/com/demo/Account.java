package com.demo;

public class Account {
	
	private int  balance=3000;
	
	public int balance() {
		return balance;
	}
	public void withdraw(int amount) {
		if(amount>balance) {
			throw new InsufficientFundException("Insuffient balance in your account");
		
		}
		balance=balance-amount;
		
		
	} 
	public static void main(String[] args) {
		
	
	Account ac=new Account();
	System.out.println(" balance;"+ac.balance());
	ac.withdraw(2500);
	System.out.println("  after remaining  balance;"+ac.balance());
	}
	

}
