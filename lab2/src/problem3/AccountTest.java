package problem3;

public class AccountTest {
    public static void main(String[] args){
        Bank bank = new Bank();

        SavingAccount sa = new SavingAccount(101, 5); 
        CheckingAccount ca = new CheckingAccount(102, 3); 
        Account acc = new Account(103);

        bank.openAccount(sa);
        bank.openAccount(ca);
        bank.openAccount(acc);

        sa.deposit(1000);
        ca.deposit(500);
        acc.deposit(300);

        ca.withdraw(100);
        ca.deposit(50);
        ca.withdraw(20); 
        ca.deposit(10);  

        bank.update(); 

        bank.printAccs();
}
}
