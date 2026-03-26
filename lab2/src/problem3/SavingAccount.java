package problem3;

public class SavingAccount extends Account{
	private double interestRate;
	
	public SavingAccount(int accNumber , double interestRate) {
		super(accNumber);
		this.interestRate = interestRate;
	}
	
	public void addInterestRate() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}
	
	@Override
	public String toString() {
		return "Saving Account number " + getAccNumber() + " the balance for now is " + getBalance() + "$"
				+ "Interest rate is : " + interestRate + "%";
	} 
}
