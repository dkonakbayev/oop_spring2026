package problem3;

public class CheckingAccount extends Account{
	private int transaction;
	private final int freetransaction;
	private static final double FEE = 0.02;
	
	public CheckingAccount(int accNumber ,int freetransaction) {
		super(accNumber);
		this.freetransaction = freetransaction;
	}
	
	@Override
	public void deposit(double sum) {
		super.deposit(sum);
		transaction++;
	}
	
	@Override
	public void withdraw(double sum) {
		super.withdraw(sum);
		transaction++;
	}
	
	public void deductFee() {
		int a = transaction - freetransaction;
		if (a > 0 ) {
			double feeamount = a * FEE;
			super.withdraw(feeamount);
		}
		
		transaction = 0;
	}
	
	@Override
	public String toString() {
		return "Checking Account number " + getAccNumber() + " the balance for now is " + getBalance() + "$"
				+ "Transactions : " + transaction;
	} 
	
	
}
