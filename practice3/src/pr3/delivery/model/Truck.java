package pr3.delivery.model;

public class Truck extends Vehicle {
	private int maxLoad;
	
	
	public Truck(String model, double baseCost, Engine engine , int maxLoad) {
		super(model, baseCost, engine);
		this.maxLoad = maxLoad;
	}
	
	@Override
	public double calculateDeliveryCost() {
		return baseCost + (maxLoad*6);
	}
	
	//overload
	public double calculatDeliveryCost(double distance , double fuelprice) {
		return calculateDeliveryCost() + fuelprice * distance;
	}
	
} 
