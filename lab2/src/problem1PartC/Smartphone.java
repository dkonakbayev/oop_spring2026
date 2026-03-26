package problem1PartC;

import java.util.Objects;

public class Smartphone extends Device{
	private int memory;
	
	public Smartphone(String brand , double price , int memory) {
		super(brand , price);
		this.memory = memory;
	}
	
	public int getMemory() {
		return memory;
	}
	
	@Override
	public String toString() {
		return super.toString() + " and this phone have - " + memory +"GB"; 
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		
		if (!(o instanceof Smartphone)) return false;
		
		Smartphone other = (Smartphone) o;
		
		return super.equals(o) && this.memory == other.memory;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode() , memory); 
	} 
}
 