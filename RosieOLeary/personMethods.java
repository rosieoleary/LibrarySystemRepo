package RosieOLeary;
import java.util.ArrayList;
public class personMethods {
	private ArrayList<Person>MembersList= new ArrayList<Person>();
	
	public void addPerson(Person p){
		MembersList.add(p);
	}
	public ArrayList<Person> getMembersList(){
		return MembersList;
	}
	public void removePerson(Person p){
		MembersList.remove(p);
	}
	public void clearPerson(){
		MembersList.clear();
	}
	
}
