package RosieOLeary;

public class Book extends LibraryObject {
	
	private String title;
	private String author;
	private String genre;
	private int pageNum;
	
	
	public Book(int id, String title, String author, String genre, int pageNum) {
		super(id);
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageNum = pageNum;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	
	
	

}
