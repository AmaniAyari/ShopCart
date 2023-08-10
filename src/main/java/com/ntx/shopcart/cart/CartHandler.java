package com.ntx.shopcart.cart;

import java.util.Collection;

public class CartHandler {

	Cart cart;
	
	public CartHandler(Cart cart) {
		this.cart = cart;
	}
	
	public double calculateTotalPurchases() {
		double total = 0;
		Collection<IProduct> products = cart.getItems().values();
		for(IProduct product : products) {
			total += product.calculateTotal();
		}
		return total;
	}
	
	public void printTicket() {
		System.out.println("Product            Quantity           Price                Total");
		System.out.println("--------------------------------------------------------------------------------");
		Collection<IProduct> products = cart.getItems().values();
		products.forEach(product -> System.out.println(product.toString()));
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Total                                                             " + calculateTotalPurchases());
	}
	
}
