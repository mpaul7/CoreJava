package implementationInheritance;

abstract class Account{
	public void deposit (double amount){
		System.out.println("Deposit");
		}
	
	public void withdraw(double amount){
		System.out.println("Withdraw");
		}
	
	public abstract double calculateInterest(double amount);
	}

class SavingsAccount extends Account{

	@Override
	public double calculateInterest(double amount) {
		// TODO Auto-generated method stub
		return 1.0;
	}
	
}

class TermDepositAccount extends Account{

	@Override
	public double calculateInterest(double amount) {
		// TODO Auto-generated method stub
		return 2.0;
	}
	
}


public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new SavingsAccount();
		acc1.deposit(5.0);
		acc1.withdraw(2.0);
		
		Account acc2 = new TermDepositAccount();
		acc2.deposit(10.0);
		acc2.withdraw(3.0);
		
		acc1.calculateInterest(100.0);
		acc2.calculateInterest(1000.0);

	}

}
