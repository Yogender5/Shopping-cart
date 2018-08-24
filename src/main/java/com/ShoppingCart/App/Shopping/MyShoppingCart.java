package com.ShoppingCart.App.Shopping;

import java.util.ArrayList;
import java.util.List;

public class MyShoppingCart {
	double sum = 0;
	double sum1 = 0;
	
	List <Item> items = new ArrayList <Item>();
	public boolean checkCartLimit()  {
		for(@SuppressWarnings("unused") Item item : items) {
			sum = sum + ((Item) items).getPrice();
			 if (sum>200) {
				try {
					throw new CartLimitException("The Cart value is more than 200");
				} catch (CartLimitException e) {
					return false;
					
				}
				
			}
		}
		return true;
		
	}// Default constructor
	public MyShoppingCart() {
	}
	
	public boolean additems(Item item) {
		return items.add(item);
	}

	public boolean removeitems(String string) {
		for(Item item : items) {
			if (string.equalsIgnoreCase(item.getName())) {
				items.remove(item);
				return true;
			}
		}
		return false;

	}

	public void getitems() {
	items.forEach(s->System.out.println(s));
	}

	public double getTotalPrice() {
		for(Item item : items) {
			 sum1 = sum1+ item.getPrice();}
			 return sum1;

	}

	public void pay() {

	}

	
	public void flushCart() {
		items.clear();
	}
	
	
	
	
	
}
