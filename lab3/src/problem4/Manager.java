package problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee{
	
	private Vector<Employee> team;
	private double bonus;
	
	public Manager(String name , double salary , Date hireDate , String insuranceNumber , double bonus) {
		super(name , salary , hireDate , insuranceNumber);
		this.bonus = bonus;
		this.team = new Vector<>();
	}
	
	public void addEmployee(Employee e) {
		team.add(e);
	}
	
	public double getBonus() {
		return bonus;
	}
	
	@Override 
	public String toString() {
		return super.toString() + 
				" | Bonus : " + bonus +
				" | Team size : " + team.size();
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(super.equals(o))) {
			return false;
		}
		if (!(o instanceof Manager)) {
			return false;
		}
		
		Manager m = (Manager) o;
		return bonus == m.bonus;
	}
	
	
	@Override 
	public int compareTo(Employee o) {
		int result = Double.compare(this.getSalary(), o.getSalary());
		
		if (result == 0 && o instanceof Manager) {
			Manager m = (Manager) o;
			return Double.compare(this.bonus , m.bonus);
		}
		
		return result;
	}
	
	
	@Override
    public Manager clone() {
        Manager cloned = new Manager(
                this.getName(),
                this.getSalary(),
                new java.util.Date(this.getHireDate().getTime()),
                this.getInsuranceNumber(),
                this.bonus
        );
        
        for (Employee e : team) {
        	cloned.addEmployee(e.clone());
        }
        
        return cloned;
	}
}
