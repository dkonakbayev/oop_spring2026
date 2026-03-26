package problem5;

public class Student extends Person{
	private int yearofstudy;
	private String speciality;
	
	public Student(String name , int age , int yearofstudy , String speciality) {
		super(name , age);
		this.yearofstudy = yearofstudy;
		this.speciality = speciality;
	}
	
	@Override
	public String getOccupation() {
		return "On the " + yearofstudy + "speciality is : " + speciality;
	}
	
}
