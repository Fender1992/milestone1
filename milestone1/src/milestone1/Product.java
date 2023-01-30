package milestone1;

public class Product {
	
	private String productName;
	private String productDescription;
	private double productPrice;
	private int productQuantity; // total amount of the product
	
	public Product (String productName, String productDescription, double productPrice, int productQuantity) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	@Override
	public String toString() {
		return "Name: " + getProductName() + " / Description: " + getProductDescription() + 
				" / Price: " + getProductPrice() + " / Total Available: " + getProductQuantity();
	}
}

