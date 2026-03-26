package problem2;

public class Main {

	public static void main(String[] args) {
		
		Restaurant r = new Restaurant();
		
		Cat cat = new Cat();
		Student s = new Student();
		
		r.servePizza(cat);
		System.out.println("----");
		r.servePizza(s);
		
	}	
}
