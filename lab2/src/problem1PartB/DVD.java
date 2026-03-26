package problem1PartB;

public class DVD extends LibraryItem{
	private int quality;
	
	public DVD(String title , String author , int publicationYear , int quality) {
		super(title , author , publicationYear);
		this.quality = quality;
	}
	
	public int getQuality() {
		return quality;
	}
	
	public String toString() {
		return super.toString() + " the quality of dvd is " + quality + "p";
 	}
	
}	
