package problem5;

import java.util.ArrayList;

public class PersonRegistry {
	private ArrayList<Person> person ;
	
	public PersonRegistry() {
		person = new ArrayList<>();
	}
	
	public void addPerson(Person p) {
		person.add(p);	
	}
	
	public String toString() {
		String res = "";
		for (Person p : person) {
			 res += p + "\n";
		}
		
		return res;
	}
}
