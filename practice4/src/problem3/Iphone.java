package problem3;

public class Iphone implements SellablePluggable{
	
	@Override
	public void sell() {
		System.out.println("Iphones are selling");
	}
	
	@Override
	public void plugIn() {
		System.out.println("Iphone is charging");
	}
}
