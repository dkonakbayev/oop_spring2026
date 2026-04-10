package problem1;

public class ForAbstract extends Example2{
	
	public ForAbstract(String name) {
		super(name);
	}
	
	@Override
	void makeSound() {
		System.out.println(name + " is screaming");
	}
}
