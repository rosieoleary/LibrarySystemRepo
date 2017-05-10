package RosieOLeary;

public class Journal extends LibraryObject{
	
	
	private String name;
	private int issue;
	
	public Journal(int id, String name, int issue) {
		super(id);
		this.name = name;
		this.issue = issue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIssue() {
		return issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	} 
	
	
	
	
}
