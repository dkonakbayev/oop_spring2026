package problem1;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student("Dauka", 1);
		
		System.out.println("Name: " + s.getName());
		System.out.println("Id: " + s.getId());
		s.incrementYearOfStudy();
		System.out.println("Year of study: " + s.getYearOfStudy());
		
		
	}
	
}
