package com.ntx.shopcart.cart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CartHandlerTest {

	static String BOOK = "Book";
	static String PEN = "Pen";
	static double BOOK_PRICE = 1.3;
	static double PEN_PRICE = 0.5;
	static int PEN_QUANTITY = 1;
	static int BOOK_QUANTITY = 1;
	

	@Test
    void testCalculateTotalPurchases() {
		Cart cart = new Cart();
        cart.addItemToCart(new Product(BOOK, BOOK_PRICE, 1));
        cart.addItemToCart(new Product(PEN, PEN_PRICE, 1));
        CartHandler handler = new CartHandler(cart);
        double total = handler.calculateTotalPurchases();
        assertEquals(BOOK_PRICE * BOOK_QUANTITY + PEN_PRICE * PEN_QUANTITY,total, 0.0);
    }
}
