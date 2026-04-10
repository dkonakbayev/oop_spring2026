package problem1;

public abstract class Example2 {
	
	String name;
	
	public Example2(String name) {
		this.name = name;
	}
	
	void eat() {
		System.out.println(name + "is eating");
	}
	
	abstract void makeSound();
	
}
