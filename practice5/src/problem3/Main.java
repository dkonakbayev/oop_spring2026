package problem3;

import java.util.*;
public class Main {
	 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Saving service = new Saving();
		ArrayList<Book> library = service.loadBooks();
		
		
		while(true) {
			System.out.println("\nA - Add book");
            System.out.println("L - List books");
            System.out.println("Q - Quit");
            
            String choise = scanner.nextLine().toUpperCase();
            
            switch (choise) {
            case "A":
            	System.out.println("title");
            	String title = scanner.nextLine();
            	
            	System.out.println("author");
            	String author = scanner.nextLine();
            	
            	library.add(new Book(title , author));
            	break;
            
            	
            case "L":
            	for (Book b : library) {
            		b.visit();
            		System.out.println(b);
            	}
            	break;
    
            
            case "Q":
            	service.saveBooks(library);
            	System.out.println("saved");
            	return;
            	
            default:
            	System.out.println("Invalid choise");
		}
	}

}
}
