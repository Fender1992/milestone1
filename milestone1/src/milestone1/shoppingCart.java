package milestone1;

public class shoppingCart {
	private double checkoutPrice;
	private double addTax;
	private int itemsInCart = 0;
	
	public shoppingCart(double checkoutPrice, int itemsInCart) {
		this.getAddTax();
		this.getItemsInCart();
		this.getCheckoutPrice();
		
	}

	public int calcTotal(int a, int b) {
		int c = a + b;
		return c ;
	}

	public double getAddTax() {
		return addTax;
	}

	public double setAddTax(int addTax) {
		int total = 0;
		double tax = total * (.03);
		return tax;
	}

	public double getCheckoutPrice() {
		return checkoutPrice;
	}

	public void setCheckoutPrice(double checkoutPrice) {
		this.checkoutPrice = checkoutPrice;
	}

	public int getItemsInCart() {
		if(itemsInCart > 0) {itemsInCart++;}
		return itemsInCart;
	}

	public void setItemsInCart(int itemsInCart) {
		this.itemsInCart = itemsInCart;
	}
	

}
