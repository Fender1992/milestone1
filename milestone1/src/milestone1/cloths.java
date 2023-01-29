package milestone1;

public class cloths {
	
	private String productName;
	private String productDescription;
	private double productPrice;
	private int productQuantity;
	
	public cloths (){
		this.setProductName(productName);
		this.setProductDescription(productDescription);
		this.setProductPrice(productPrice);
		this.setProductQuantity(productQuantity);
	}	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.setProductName(productName);
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
	

}
