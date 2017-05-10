package RosieOLeary;

public class MediaResource extends LibraryObject {
	
	private String type;
	private boolean complete;
	
	public MediaResource(int id, String type, boolean complete) {
		
		super(id);
		this.type = type;
		this.complete = complete;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	

}
