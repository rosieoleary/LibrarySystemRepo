package RosieOLeary;

public class Main {
	public static void main(String[] args){
		Book b1 = new Book (1,"The Girl with the Dragon Tattoo", "Stieg Larson","Crime",535);
		Book b2 = new Book (2,"Harry Potter and the Prisoner of Azkaban", "J.K. Rowling","Fantasy", 432);
		Book b3 = new Book (3,"Call for the Dead", "John leCarre", "Thriller", 345);
		
		bookMethods bM = new bookMethods();
		journalMethods jM = new journalMethods();
		mediaResourceMethods mrM = new mediaResourceMethods();
		personMethods pM = new personMethods();
		
		bM.addToArrayList(b1);
		bM.addToArrayList(b2);
		bM.addToArrayList(b3);
		
		bM.checkoutItem(b1, "14/12/2007");
		//bM.checkinItem(b1, "15/1/2007");
		bM.checkoutItem(b1, "15/12/2007");
		
		//System.out.println("ID: "+b1.getId()+" Title: "+b1.getTitle());
		
		
		
	}
	
	
}
