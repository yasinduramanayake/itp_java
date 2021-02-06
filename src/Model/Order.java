package Model;

public class Order {
	
	private int OrderID;
	private double price; 
	private int Quantity;
	private String Email;
	private int cusid;
	
	
	public int getOrderID() {
		return OrderID;
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String  getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
