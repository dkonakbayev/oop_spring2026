package problem1PartB;

public class Magazin extends LibraryItem{
	private String jenre;
	
	public Magazin(String title , String author , int publicationYear , String jenre) {
		super(title , author , publicationYear);
		this.jenre = jenre;
	}
	
	public String getJenre() { 
		return jenre;
	}
	
	public String toString() {
		return super.toString() + "the jenre is " + jenre;
	}
	
}
