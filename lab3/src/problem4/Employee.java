package problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee> , Cloneable{
		
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee(String name , double salary , Date hireDate , String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				" | salary : " + salary +
				" | hire date : " + hireDate +
				" | insurance number : " + insuranceNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) {
			return false;
		}
		if (!(o instanceof Employee)) {
			return false;
		}
		
		Employee e = (Employee) o;
		
		return salary == e.salary && insuranceNumber.equals(e.insuranceNumber);
	}
	
	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.salary , o.salary);
	}
	
	
	@Override
	public Employee clone() {
		return new Employee(
				this.name ,
				this.salary ,
				new Date(this.hireDate.getTime()) ,
				this.insuranceNumber
				);
				
	}
}
