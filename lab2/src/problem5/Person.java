package problem5;

public abstract class Person {
	protected String name;
	protected int age;
	protected Animal pet;
	
	public Person(String name , int age ) {
		this.name = name;
		this.age = age;
	}
	
	public void assignPet(Animal pet) {
		if (this.pet == null) {
			this.pet = pet; 	
		}
	}
	
	public Animal removePet() {
		Animal temp = pet;
		pet = null; 
		return temp;
	}
	
	public boolean hasPet() {
		return pet != null;
	}
	
	public void leavePetWith(Person other) {
		if (!hasPet()) {
			System.out.println("doesnt have a pet");
		}
		if (other.hasPet()) {
			System.out.println(other.name + "already has a pett");
		}
		if ((other instanceof PHDstudent) && (pet instanceof Dog)) {
			System.out.println("PHD student cannot take a dog");
			return;
		}
		Animal temp = removePet();
		other.assignPet(temp);
	}
	
	public void retrievePetFrom(Person other) {
		if (other.hasPet()){
			Animal temp = other.removePet();
			assignPet(temp);
		}
	}
	
	public abstract String getOccupation();
	
	@Override
	public String toString() {

	    String petInfo;

	    if (pet == null) {
	        petInfo = "Doesn't have a pet";
	    } else {
	        petInfo = pet.toString();
	    }

	    return name + " (" + age + ") - " + getOccupation() +
	           " | Pet: " + petInfo;
	}
		 
}
