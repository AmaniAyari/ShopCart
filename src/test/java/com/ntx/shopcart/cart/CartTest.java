package com.ntx.shopcart.cart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CartTest {

	static String BOOK = "Book";
	static double BOOK_PRICE = 1.3;
	static String PEN = "Pen";
	static double PEN_PRICE = 0.5;
	static int PEN_QUANTITY = 2;
	static int BOOK_QUANTITY = 1;
	
	
	@Test
    void testAddItemToCart() {
        Cart cart = new Cart();
        cart.addItemToCart(new Product(BOOK, BOOK_PRICE, BOOK_QUANTITY));
        assertEquals(BOOK_QUANTITY, cart.getItems().size());
    }
	
	@Test
    void testRemoveItemFromCart() {
		Cart cart = new Cart();
        cart.addItemToCart(new Product(BOOK, BOOK_PRICE, BOOK_QUANTITY));
        cart.addItemToCart(new Product(PEN, PEN_PRICE, PEN_QUANTITY));
        assertEquals(2, cart.getItems().size());
        cart.removeItemFromCart(BOOK);
        assertEquals(1, cart.getItems().size());
    }
	
	
	
}
