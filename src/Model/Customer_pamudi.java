package Model;

public class Customer_pamudi {

	private int id;
	private String category;
	private String fullName;
	private String phone;
	private String email;
	private String registerid;
	
	public Customer_pamudi(int id, String category, String fullName, String phone, String email, String registerid) {
		
		this.id = id;
		this.category = category;
		this.fullName = fullName;
		this.phone = phone;
		this.email = email;
		this.registerid = registerid;
	}

	public int getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}

	public String getFullName() {
		return fullName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getRegisterid() {
		return registerid;
	}

	
}


