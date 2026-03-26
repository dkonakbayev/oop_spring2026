package problem1PartB;

public class Librarytest {
	public static void main(String[] args) {
		
		Book b1 = new Book("Game of Thrones" , "G. Martin" , 1996 , 1000);
	    DVD d1 = new DVD("1 + 1" , "P. Borgo" , 2010 , 480);
	
		System.out.println(b1.toString());
		System.out.println(d1.toString());
	}
}
