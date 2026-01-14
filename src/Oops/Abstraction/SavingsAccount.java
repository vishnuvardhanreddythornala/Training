package Oops.Abstraction;

class SavingsAccount extends BankAccount{
	
	@Override
	public void deposit() {
		System.out.println("Amount deposited in Savings Account");
	}
	
	@Override
	public void withdraw() {
		System.out.println("Amount withdrawn from Savings Account");
	}
}
