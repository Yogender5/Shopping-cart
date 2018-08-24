package com.ShoppingCart.App.Shopping;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		MyShoppingCart cart = new MyShoppingCart();

		String addItem = "yes";
		double totalAmount;

		while (addItem.equalsIgnoreCase("yes")) {
			Item item = new Item(addItem, 0);
			System.out.println("Enter the name of the product");
			item.setName(scanner.next());
			System.out.println("Enter the price of the product");
			item.setPrice(scanner.nextFloat());
			boolean  flag = cart.checkCartLimit();
			if (!flag) {
				System.out.println("Your cart exceeded $200");
			}
			if (flag) {
				cart.additems(item);

			}
			System.out.println("Do you want to add more items? reply with yes or no");
			addItem = scanner.next();
		}

		System.out.println("Do you want to see all the items ? Reply with yes or no");
		if (scanner.next().equals("yes")) {
			cart.getitems();
		}

		System.out.println("\nDo you want to remove any items ? reply with yes or no\n");
		if (scanner.next().equals("yes")) {
			cart.getitems();
			System.out.println("Enter the name of the item you want to remove");
			cart.removeitems(scanner.next());
		}

		System.out.println("Items after modifications");
		cart.getitems();
		
		System.out.println("Total price of the cart : ");
		totalAmount = cart.getTotalPrice();
		System.out.println(totalAmount);
		
		System.out.println("How do you want to pay ? reply with card or payPal");
		if (scanner.next().equalsIgnoreCase("Paypal")) {
			PaypalPaymentStrategy paypal = new PaypalPaymentStrategy(null, null);
			System.out.println("Enter the Email");
			paypal.setEmailId(scanner.next());
			System.out.println("Enter the password");
			paypal.setPassword(scanner.next());
			System.out.println(paypal);
			paypal.pay(totalAmount);
			
		}
		
		else {
			CardPaymentStrategy cardPaymentStrategy = new CardPaymentStrategy(null, null, 0, null);
			System.out.println("Enter the card holder name ");
			cardPaymentStrategy.setCardHolderName(scanner.next());
			System.out.println("Enter the card number");
			cardPaymentStrategy.setCardNumber(scanner.next());
			System.out.println("Enter the CVV");
			//cardPaymentStrategy.setCVV(scanner.nextInt());
			System.out.println("Enter the date of expiry");
			cardPaymentStrategy.setDateOfExpiry(scanner.next());
			System.out.println(cardPaymentStrategy);
			cardPaymentStrategy.pay(totalAmount);
		}
		scanner.close();
		cart.flushCart();
	}
		
		
		
		
	}


