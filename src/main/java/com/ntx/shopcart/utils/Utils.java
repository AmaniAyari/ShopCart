package com.ntx.shopcart.utils;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ntx.shopcart.cart.Cart;

public class Utils {

	public static final String SPACE = "                ";


	public static void saveToJsonFile(Cart cart, String filePath) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(cart.getItems());

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(json);
            System.out.println("File saved successfully.");
        } catch (IOException e) {
        	System.out.println("Could not save file " + e.getMessage());
        }
	}
}
