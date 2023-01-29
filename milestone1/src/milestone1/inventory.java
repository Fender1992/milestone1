package milestone1;

public class inventory {
	private String itemList;
	private char itemSizes;
	private int itemCount;
	
	public inventory() {
		this.setItemCount(itemCount);
		this.setItemList(itemList, itemList, itemList);
		this.setItemSizes(itemSizes, itemSizes, itemSizes);
	}

	public String getItemList() {
		return itemList;
	}

	public void setItemList( String itemList, String a, String b) {
		this.itemList = itemList;
	}

	public int getItemSizes() {
		return itemSizes;
	}

	public void setItemSizes(char itemSizes, char c, char d) {
		this.itemSizes = itemSizes;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		int numItems = 10;
		this.itemCount = itemCount;
	}


}
