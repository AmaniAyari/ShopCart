package com.ntx.shopcart.main;

import com.ntx.shopcart.cart.Cart;
import com.ntx.shopcart.cart.CartHandler;
import com.ntx.shopcart.cart.Product;
import com.ntx.shopcart.utils.Utils;

public class ShoppingCartSystem {

	public static void main(String[] args) {
		Cart cart = createCart();
		CartHandler cartHandler = new CartHandler(cart);
		cartHandler.printTicket();
		String path = "C:\\temp\\cart.json";
		Utils.saveToJsonFile(cart, path);
		
	}

	private static Cart createCart() {
		Cart cart = new Cart();
        cart.addItemToCart(new Product("Pen", 0.5, 3));
        cart.addItemToCart(new Product("Book", 1.5, 2));
		return cart;
	}
	
}
