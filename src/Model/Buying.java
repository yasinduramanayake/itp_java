package Model;

public class Buying {
	
	private int Buyid;
	private double price;
	private String color;
	private int CusID;
	private String ItemName;
	
	
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * @return the buyid
	 */
	public int getBuyid() {
		return Buyid;
	}
	/**
	 * @param buyid the buyid to set
	 */
	public void setBuyid(int buyid) {
		Buyid = buyid;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the cusID
	 */
	public int getCusID() {
		return CusID;
	}
	/**
	 * @param cusID the cusID to set
	 */
	public void setCusID(int cusID) {
		CusID = cusID;
	}
	


}
