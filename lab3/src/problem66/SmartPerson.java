package problem66;

public class SmartPerson extends Person implements Movable , Eatable , Comparable<SmartPerson> , Cloneable{
	
	public SmartPerson(String name , int age) {
		super(name , age);
	}
	
	@Override 
	public void move() {
		System.out.println(name + " is walking");
	}
	
	@Override
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	@Override
	public int compareTo(SmartPerson other) {
		return this.name.compareTo(other.name);
	}
	
	
	@Override
	public SmartPerson clone() {
		try {
			return (SmartPerson) super.clone();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	
	
}
