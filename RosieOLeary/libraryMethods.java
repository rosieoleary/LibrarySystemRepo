package RosieOLeary;

import java.util.ArrayList;

public interface libraryMethods {
	
	public void addToArrayList(LibraryObject lo);
	public void removeFromArrayList(LibraryObject lo);
	public void checkoutItem(LibraryObject lo, String DateOut);
	public void checkinItem(LibraryObject lo, String DateIn);
	public ArrayList<LibraryObject> getArrayList();
	public void clearArrayList();
}
