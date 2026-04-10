package problem2;

public class Person implements Dancable{
	
	@Override
	public void move() {
		System.out.println("person is moving");
	}
	
	@Override
	public void dance() {
		System.out.println("person is dancing");
	}
	
}
