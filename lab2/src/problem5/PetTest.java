package problem5;

public class PetTest {
	public static void main(String[] args) {
		Person john = new Employee("John", 30, "Engineer");
		Person alice = new PHDstudent("Alice", 26, "Comp. Science");
		Animal murka = new Dog("Murka", 5);
		john.assignPet(murka); 
		PersonRegistry registry = new PersonRegistry();
		registry.addPerson(john);
		registry.addPerson(alice);
		System.out.println(registry);
		john.leavePetWith(alice);
		System.out.println(registry);
		john.retrievePetFrom(alice);
		System.out.println(registry);
	}
}
