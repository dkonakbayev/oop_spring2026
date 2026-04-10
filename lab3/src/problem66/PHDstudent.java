package problem66;


public class PHDstudent extends Person{
	private String science;
	
	public PHDstudent(String name , int age , String science) {
		super(name , age);
		this.science = science;
	}
	
	public String getOccupation() {
		return "Study and research in " + science;
	}
	
	@Override
	public void assignPet(Animal pet) {
		if (pet instanceof Dog) {
			return;
		}
		
		super.assignPet(pet); 
	}
}
