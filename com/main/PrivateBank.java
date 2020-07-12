package com.main;

public class PrivateBank implements BankRules {
	String customer_name; 
	PrivateBank(String customer_name) {
	this.customer_name=customer_name;
	}
	@Override
	public void interest_paid() {
		System.out.println(this.customer_name +" paid an interest of 5%");
	}
}
