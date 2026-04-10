package problem3;

import java.io.*;
import java.util.*;

public class Saving {
	 private static final String FILE_NAME = "library.dat";
	 static ArrayList<Book> loadBooks() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
	            return (ArrayList<Book>) ois.readObject();
	        } catch (Exception e) {
	            return new ArrayList<>(); 
	        } 
	    }
	 
	 static void saveBooks(ArrayList<Book> library) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
	            oos.writeObject(library);
	        } catch (IOException e) {
	            System.out.println("Error saving file");
	        }
	    }
	}


