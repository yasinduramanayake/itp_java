package Model;

public class Pricing_details {
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	private String material;
	private String labours;
	private String type;
	private Double mat_cost;
	private Double lab_cost;
	private Double Discount;
	private String Name;
	private int itemNO;

	public int getItemNO() {
		return itemNO;
	}
	public void setItemNO(int itemNO) {
		this.itemNO = itemNO;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getLabours() {
		return labours;
	}
	public void setLabours(String labours) {
		this.labours = labours;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getMat_cost() {
		return mat_cost;
	}
	public void setMat_cost(Double mat_cost) {
		this.mat_cost = mat_cost;
	}
	public Double getLab_cost() {
		return lab_cost;
	}
	public void setLab_cost(Double lab_cost) {
		this.lab_cost = lab_cost;
	}
	public Double getDiscount() {
		return Discount;
	}
	public void setDiscount(Double discount) {
		Discount = discount;
	}
	

}

