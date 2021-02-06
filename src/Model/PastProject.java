package Model;

public class PastProject {
	private int proect_ID;
	private String Description;
	private String Type;
	private  static String images;
	
	
	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public PastProject() {
		super();
	}

	
	public int getProect_ID() {
		return proect_ID;
	}
	public void setProect_ID(int proect_ID) {
		this.proect_ID = proect_ID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	

}
