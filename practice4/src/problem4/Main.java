package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Daulet" , 4.0));
		list.add(new Student("Biba" , 3.9));
		list.add(new Student("Miras" , 3.8));
		list.add(new Student("Saken" , 3.7));
		list.add(new Student("Doni" , 3.6));
		
		
		Collections.sort(list);
		
		System.out.println("Sorting by gpa:");
		for (Student s : list) {
			System.out.println(s.name + " " + s.gpa);
		}
		
		Collections.sort(list , new NameComparator());
		
		System.out.println("\nSorting by name:");
		for (Student s : list) {
			System.out.println(s.name + " " + s.gpa);
		}
	}

}
