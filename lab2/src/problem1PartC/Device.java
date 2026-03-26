package problem1PartC;

import java.util.Objects;

public class Device {
	private String brand;
	private double price;
	
	public Device(String brand , double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "phone is " + brand + " the price is " + price; 
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Device)) {
			return false;
		}
		
		Device other = (Device) o;
		
		return this.brand.equals(other.brand) && this.price == other.price;
		
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand , price); 
	} 
} 
