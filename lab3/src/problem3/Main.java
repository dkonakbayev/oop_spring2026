package problem3;

public class Main {

	public static void main(String[] args) {
		
		MyCollection<String> collection = new CollectionService<>();
		
		collection.add("apple");
		collection.add("banana");
		
		System.out.println(collection.contains("apple"));
		System.out.println(collection.size());
		
		collection.remove("banana");
		
		System.out.println(collection.size());
		System.out.println(collection.isEmpty());
	}

}
