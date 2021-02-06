package Model;

public class Event {

	private int id;
	private String title;
	private String description;
	private String category;
	private String eventcode;
	
	public Event(int id, String title, String description, String category, String eventcode) {
		
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.eventcode = eventcode;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public String getEventcode() {
		return eventcode;
	}
}
