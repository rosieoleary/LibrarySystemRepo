package RosieOLeary;

public abstract class LibraryObject {
	
	private int id = 1;

	public LibraryObject(int id) {
		super();
		this.id = id++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
