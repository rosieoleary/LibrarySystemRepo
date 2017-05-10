package RosieOLeary;
import java.util.ArrayList;
public class mediaResourceMethods implements libraryMethods{

		private ArrayList<LibraryObject>MediaResourceList =new ArrayList<LibraryObject>();
	@Override
	public void addToArrayList(LibraryObject lo) {
		
		MediaResourceList.add(lo);
		
	}

	@Override
	public void removeFromArrayList(LibraryObject lo) {
		
		MediaResourceList.remove(lo);
		
	}
	@Override
	public void checkoutItem(LibraryObject lo, String DateOut) {
		
			for (int i = 0; i<MediaResourceList.size();i++){ 
				if (MediaResourceList.get(i).getId()==lo.getId()){
			
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
			
					MediaResourceList.remove(lo);
					System.out.println(inDate);
					}
				
				}

		}

	@Override
	public void checkinItem(LibraryObject lo, String DateIn) {
		MediaResourceList.add(lo);
		
	}
	@Override
	public ArrayList<LibraryObject> getArrayList(){
		return MediaResourceList;
		
	}
	@Override
	public void clearArrayList(){
		MediaResourceList.clear();
	}
	
	
}
