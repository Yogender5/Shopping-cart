package com.ShoppingCart.App.Shopping;


public class CardPaymentStrategy implements PaymentStrategy{
  
	public void pay(double orderAmount) {
		System.out.println("The Transaction was sucessful");
		
	}
	
	private String cardHolderName;
	private String cardNumber;
	private int cvv;
	private String dateOfExpiry;
	
	
	
	public CardPaymentStrategy(String cardHolderName, String cardNumber, int cvv, String dateOfExpiry) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	
}
