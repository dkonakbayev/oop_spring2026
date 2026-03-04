package pr3.animal.model;

public class Cat extends Animal {
	private String breed;
	
	public Cat(String name , int age , String breed) {
		super(name , age);
		this.breed = breed;
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + "says : myau");
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Breed : " + breed);
	}
}
