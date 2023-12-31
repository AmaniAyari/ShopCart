package com.ntx.shopcart.cart;

import com.ntx.shopcart.utils.Utils;

public class Product implements IProduct {

	transient String name;
	double price;
	int quantity;
	double total;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.total = price * quantity;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double getPrice() {	
		return price;
	}
	
	@Override
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return name + Utils.SPACE + quantity + Utils.SPACE + price + Utils.SPACE +  calculateTotal();
	}
	
	@Override
	public double calculateTotal() {
		return quantity * price;
	}
}
