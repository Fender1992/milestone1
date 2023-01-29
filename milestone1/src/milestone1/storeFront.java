package milestone1;

public class storeFront {

	public static void main(String[] args) {
		//Greet customers
		System.out.println("Welcome to our storefront");
		
		//Create person shopping in the store
		Person person1 = new Person(null, 0);
		
		//Create shopping cart object to add products to
		shoppingCart cart = new shoppingCart(0.0, 0);
		
		
		//create inventory of object
		inventory myProducts = new inventory();
		myProducts.setItemCount(10);
		myProducts.setItemSizes('S', 'M', 'L' );
		myProducts.setItemList("Tshirts", "Sweaters", "Socks");
		
		//create shirt object
		cloths Shirt1 = new cloths();
		
		Shirt1.setProductQuantity(10); 
		Shirt1.setProductDescription("Large Spiderman shirt");
		Shirt1.setProductName("My awesome tee");
		Shirt1.setProductPrice(9.99);

		//System.out.println("$" + Shirt1.getProductName());
	}

}
