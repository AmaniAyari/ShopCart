package com.ntx.shopcart.cart;

public interface IProduct {

	String getName();
	double getPrice();
	int getQuantity();
	double calculateTotal();
}
