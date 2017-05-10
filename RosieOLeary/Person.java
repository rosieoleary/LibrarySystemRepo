package RosieOLeary;

public class Person {
	private String name;
	private String dob;
	private String enrolled;
	
	public Person(String name, String dob, String enrolled) {
		super();
		this.name = name;
		this.dob = dob;
		this.enrolled = enrolled;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEnrolled() {
		return enrolled;
	}
	public void setEnrolled(String enrolled) {
		this.enrolled = enrolled;
	}
	
	
	
	

}
