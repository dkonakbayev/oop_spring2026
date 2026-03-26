package problem1PartB;

public class Book extends LibraryItem{
	private int pages;
	
	public Book(String title , String author , int publicationYear , int pages) {
		super(title , author , publicationYear);
		this.pages = pages;
	}
	
	public int getPages() {
		return pages;
	} 
	
	public String toString() {
		return super.toString() + " number of pages : " + pages;	
		
	}
		 
}
