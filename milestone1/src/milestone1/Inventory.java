package milestone1;

import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Product> inventory;
	
	public Inventory(ArrayList<Product> inventory) {
		this.inventory = inventory;
	}
	
	public ArrayList<Product> getInventory() {
		return inventory;
	}
	
	public void setInventory(ArrayList<Product> inventory) {
		this.inventory = inventory;
	}

	public Product verifyProduct(String itemName) {
		for(int i = 0; i < inventory.size(); i++) {
			if(itemName.equalsIgnoreCase(inventory.get(i).getProductName())) {
				return inventory.get(i);
			}
		}
		return null;
	}

}
