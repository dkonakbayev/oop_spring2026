package problem4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("mike" , 1000 , new Date() , "10");
		Employee e2 = new Employee("pike" , 2000 , new Date() , "20");
		
		Manager m1 = new Manager("rike" , 2000 , new Date() , "30" , 500);
		
		m1.addEmployee(e1);
		m1.addEmployee(e2);
		
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(m1);
		
		
		Collections.sort(list);
		System.out.println("sort by salary");
		list.forEach(System.out::println);
		
		
		
		list.sort(new NameComparator());
		System.out.println("\nsort by names");
		list.forEach(System.out::println);
		
		
		
		list.sort(new HireDateComparator());
		System.out.println("\nsort by date of hiring");
		list.forEach(System.out::println);
		
		
		
		Manager clone = m1.clone();
		System.out.println("\ncloned manager");
		System.out.println(clone);
	}

}
