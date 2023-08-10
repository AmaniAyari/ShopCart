package com.ntx.shopcart.cart;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cart {

	Map<String, IProduct> products = new HashMap<>();
	
	public void addItemToCart(IProduct item) {
		products.put(item.getName(), item);
	}
	
	public void removeItemFromCart(String name) {
		products.remove(name);
	}
	
	public Map<String, IProduct> getItems() {
		return Collections.unmodifiableMap(products);
	}
}
