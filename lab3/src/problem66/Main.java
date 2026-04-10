package problem66;

public class Main {

	public static void main(String[] args) {
		
		SmartPerson p1 = new SmartPerson("Daulet" , 18);
		SmartPerson p2 = new SmartPerson("Biba" , 18);
		
		p1.move();
		p2.eat();
		
		System.out.println(p1.compareTo(p2));
		
		
		SmartPerson copy = p1.clone();
		System.out.println(copy.name);
		
		SmartAnimal a1 = new SmartAnimal("Aqtaban" , 3);
		SmartAnimal a2 = new SmartAnimal("Aqtaban" , 4);
		
		a1.move();
		a2.eat();
		
		System.out.println(a1.compareTo(a2));
	}

}
