package RosieOLeary;
import java.util.ArrayList;
public class journalMethods implements libraryMethods {

	private ArrayList<LibraryObject>JournalList= new ArrayList<LibraryObject>();
	@Override
	public void addToArrayList(LibraryObject lo) {
		
		JournalList.add(lo);
	}

	@Override
	public void removeFromArrayList(LibraryObject lo) {
		
		JournalList.remove(lo);
	}
	
	public void checkoutItem(LibraryObject lo, String DateOut) {
		
		for (int i = 0; i<JournalList.size();i++){ 
			if (JournalList.get(i).getId()==lo.getId()){
		
				String[] DateArray = DateOut.split("/");
				int outDay = Integer.parseInt(DateArray[0]);
				int outMonth = Integer.parseInt(DateArray[1]);
				int outYear = Integer.parseInt(DateArray[2]);
		
				int inDay = outDay + 21;
				int inMonth;
				int inYear;
				if (inDay>31){
					inMonth= outMonth+1;
					inDay=inDay-31;
					if (inMonth>12){
						inYear = outYear+1;
						inMonth=inMonth-12;
					}
					else {
						inYear=outYear;
					}
				}
				else {
					inMonth=outMonth;
					inYear=outYear;
				}
		
				String inDayStr = Integer.toString(inDay);
				String inMonthStr= Integer.toString(inMonth);
				String inYearStr=Integer.toString(inYear);
		
				String inDate = inDayStr+"/"+inMonthStr+"/"+inYearStr;
		
				JournalList.remove(lo);
				System.out.println(inDate);
				}
				}
			
			}

	@Override
	public void checkinItem(LibraryObject lo, String DateIn) {
		JournalList.add(lo);
		
	}
	@Override
	public ArrayList<LibraryObject> getArrayList(){
		return JournalList;
		
	}
	@Override
	public void clearArrayList(){
		JournalList.clear();
	}
	
	}

