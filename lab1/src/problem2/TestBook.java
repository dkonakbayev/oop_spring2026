package problem2;

public class TestBook {

	public static void main(String[] args) {
		
		Book b1 = new Book(1 , Genre.SCIENCE ,  "Space");
		Book b2 = new Book(2 , Genre.FICTION , "Game Of Thrones");
		
		b1.addpages(300);
		b2.addpages(1000);
		
		
		System.out.println(b1.gettitle() + " has " + b1.getpages() + " pages ");
		System.out.println(b2.gettitle() + " has " + b2.getpages() + " pages");
		
		System.out.println("Totsl books in " + Book.LibraryName + " - " + Book.TotalBooks );
	}

}
