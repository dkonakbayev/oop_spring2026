package problem2;

enum Genre {
    FICTION,
    NONFICTION,
    SCIENCE
}

public class Book {
	public static int TotalBooks = 0;
	
	
	public static final String LibraryName = "Central Library";
	
	
	private final int id;
	private final Genre genre;
	
	
	private String title;
	private int pages;
	
	{
		System.out.println("creating a new book");
		TotalBooks++;
	}
@Override
	public String toString() {
		return title;
	} 
	
	public Book(int id, Genre genre, String title) {
		this.id = id;
		this.genre = genre;
		this.title = title;
		this.pages = 0;
	}
	
	public void addpages(int num) {
		this.pages += num;
	}
	public void addpages(int p, String note) {
		this.pages += p;
		System.out.println("Note: " + note);
	}
	
	
	
	public int getid() {
		return id;
	}
	
	public Genre getgenre() {
		return genre ;
	}
	
	public int getpages() {
		return pages;
	}
	
	public String gettitle() {
		return title;
	}
}














