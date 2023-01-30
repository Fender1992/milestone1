package milestone1;

public class cloths {
	
	private String productName;
	private String productDescription;
	private double productPrice;
	private int productQuantity;
	
	public cloths (String productName, String productDescription, int productQuantity){
		this.setProductName(productName);
		this.setProductDescription(productDescription);
		this.setProductPrice();
		this.setProductQuantity(productQuantity);
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

	public void setProductPrice() {
		if(productName.equals("My Awesome tee")) {
			productPrice = 9.99;
		}
		else if(productName.equals("My Awesome Sweater")) {
			productPrice = 19.99;
		}
		else if(productName.equals("My Awesome Socks")) {
			productPrice = 4.99;
		}
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	

}
