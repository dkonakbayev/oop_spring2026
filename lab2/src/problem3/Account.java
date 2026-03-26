package problem3;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		if (sum > 0) {
			balance += sum;
		}
		else {
			System.out.println("There is no money");
		}
	}
	
	public void withdraw(double sum) {
		if (sum > 0 && sum <= balance) {
			balance -= sum;
		}
		else {
			System.out.println("not enough money");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	
	public void transfer(double amount , Account other) {
		if (amount > 0 && amount <= balance) {
			withdraw(amount);
			other.deposit(amount);
		}
		else {
			System.out.println("not enough money oe not correct amount");
		}
	}
	
	public String toString() {
		return "Account number is " + accNumber + " Balance is " + balance + "$";
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
