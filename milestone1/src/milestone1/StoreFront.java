package milestone1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StoreFront {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		//Greet customers
		System.out.println("Welcome to our StoreFront\n");
		
		
		//instantiate new cart object
		ShoppingCart cart = new ShoppingCart();
		
		Product p1 = new Product("shirt", "Adidas", 29, 100);
		Product p2 = new Product("hat", "Nike", 39, 50);
		Product p3 = new Product("headband", "Under Armour", 19, 75);
		
		ArrayList<Product> myInventory = new ArrayList<Product>();
		myInventory.add(p1);
		myInventory.add(p2);
		myInventory.add(p3);
		
		//construct new inventory object to verify product name to the name of current item
		Inventory inventory = new Inventory(myInventory);
		
		//run while loop to check item totals, names and prices
		while(true) {
			System.out.println("Products available for puchase: \n");
			for (Product p : myInventory) {
				System.out.println(p);
			}
			System.out.print("\nWhat is the name of the product you would you like to buy? ");
			String productName = userInput.nextLine();
			Product chosen = inventory.verifyProduct(productName);
			if(chosen == null) {
				System.out.println("\nPlease enter a valid item\n");
				continue;
			} else {
				System.out.print("\nHow many " + productName.toLowerCase() + "s are you buying? ");
				int chosenAmount = userInput.nextInt();
				userInput.nextLine();
				if (chosenAmount <= 0) { 
					System.out.println("Invalid quantity entered \n"); 
				} else if (chosenAmount > chosen.getProductQuantity()) {
					System.out.println("Not enough inventory. You can only buy " + chosen.getProductQuantity() + " " + productName + "(s)!");
				} else {
					System.out.println("Added " + chosenAmount + " " + productName.toLowerCase() + "(s) to your shopping cart!\n");
					cart.addItem(chosen, chosenAmount);
					chosen.setProductQuantity(chosen.getProductQuantity() - chosenAmount);
					System.out.print("Are you ready to check out (Y/N)? ");
					String ready = userInput.nextLine().trim();
					System.out.println("");
					if(ready.equalsIgnoreCase("Y")) {
						break;
					} else {
						continue;
					}
				}
			}
		}
		
		System.out.println("\nYour final shopping cart: ");
		//go through keys in hashmap
		for (Product p : cart.getCart().keySet()) {
			System.out.println(p.getProductName() + " (" + cart.getCart().get(p) + ")");
		}
		System.out.println("-----");
		System.out.println("TOTAL: $" + String.format("%.2f", cart.calculateTotal()));
	}
}
