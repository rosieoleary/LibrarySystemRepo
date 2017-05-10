package RosieOLeary;
import java.util.ArrayList;
public class libraryObjectMethods {
	private ArrayList<LibraryObject> LibraryItemsList= new ArrayList<LibraryObject>();
	
	public void addToItemsList(LibraryObject lo){
		LibraryItemsList.add(lo);
	}
	public void removeFromItemsList(LibraryObject lo){
		LibraryItemsList.remove(lo);
		
	}
	public ArrayList<LibraryObject> getLibraryItemsList(){
		return LibraryItemsList;
	}
	

}
