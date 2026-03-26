package problem2;

public class Student extends Person implements CanHavePizza , CanHaveRetake , Movable{
	
	@Override 
	public void eatPizza() {
		System.out.println("Student eats pizza");
	}
	
	@Override
	public void retakeExam() {
		System.out.println("Student get a retake for this discipline");
	}
	
	@Override
	public void dance() {
		System.out.println("Tango");
	}
	
	@Override
	public void move() {
		System.out.println("Student is moving forward");
	}
}
