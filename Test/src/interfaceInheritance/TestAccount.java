package interfaceInheritance;


//===================================================
interface Account{
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract int getAccountType();
	
}
//====================================================
interface SavingAccount extends Account{
	public abstract double  calculateInterest(double amount);
	}

//===============================================
interface TermDepositAccount extends Account{
	public abstract double  calculateInterest(double amount);
	}
//===============================================
class SavingAccountImpl implements SavingAccount{
	
	AccountHelper helper = new AccountHelper();

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		helper.deposit(10.0);
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		helper.withdraw(10.0);
	}

	@Override
	public int getAccountType() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double calculateInterest(double amount) {
		// TODO Auto-generated method stub
		return amount/10;
	}
	
}
//====================================================
class TermDepositImpl implements  TermDepositAccount{
	AccountHelper helper = new AccountHelper();

	@Override
	public void deposit(double amount) {
		helper.deposit(10.0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		helper.withdraw(10.0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAccountType() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double calculateInterest(double amount) {
		// TODO Auto-generated method stub
		return amount/10;
	}
	
}
//=============================================
class AccountHelper{
	public void deposit (double amount){
		System.out.println("Deposit");
		}
	
	public void withdraw(double amount){
		System.out.println("Withdraw");
		}
}
//=============================================
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new SavingAccountImpl();
		acc1.deposit(100.0);
		
		Account acc2 = new TermDepositImpl();
		acc2.deposit(200.0);
		
		if (acc1.getAccountType() == 1) {
			((SavingAccount) acc1).calculateInterest(500.00);
			System.out.println(((SavingAccount) acc1).calculateInterest(500.00));
			}
		if (acc2.getAccountType() == 2) {
			((TermDepositAccount) acc2).calculateInterest(500.00);
			}
		}
	}
