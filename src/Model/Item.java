package Model;

public class Item {

	private int id;
	private String price;
	private String discount;
	private String category;
	private String itemcode;
	
	public Item(int id, String price, String discount, String category, String itemcode) {
		
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.category = category;
		this.itemcode = itemcode;
	}

	public int getId() {
		return id;
	}

	public String getPrice() {
		return price;
	}

	public String getDiscount() {
		return discount;
	}

	public String getCategory() {
		return category;
	}

	public String getItemcode() {
		return itemcode;
	}
	
}
