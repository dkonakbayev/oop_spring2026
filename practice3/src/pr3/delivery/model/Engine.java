package pr3.delivery.model;

public class Engine {
	private String type;
	private double horsepower;
	
	
	public Engine(String type , double horsepower) {
		this.type = type;
		this.horsepower = horsepower;
	}
	
	public void getEngineInfo() {
		System.out.println("Type : " + type);
		System.out.println("Horse power : " + horsepower);
	}
	
	
}
