package problem5;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract String getSound();
	
	public String toString() {
		return name + " is a " + age + " years old ";
	}
	
}
