package problem66;

import problem66.Animal; 

public class SmartAnimal extends Animal implements Movable , Eatable , Comparable<SmartAnimal>{
	
	public SmartAnimal(String name , int age) {
		super(name , age);
	}
	
	@Override 
	public void move() {
		System.out.println(name + " is walking");
	}
	
	@Override
	public void eat() {
		System.out.println(name + " is eating food");
	}
	
	
	@Override
	public String getSound() {
		return "make sound";
	} 
	
	@Override 
	public int compareTo(SmartAnimal other) {
		return this.name.compareTo(other.name);
	}
	
	
}
