package com.ShoppingCart.App.Shopping;


public class PaypalPaymentStrategy implements PaymentStrategy {

	private String emailId;
	private String Password;
	
	public PaypalPaymentStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		Password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public void pay(double orderAmount) {
		System.out.println("Transaction successful");

	}

	
}
