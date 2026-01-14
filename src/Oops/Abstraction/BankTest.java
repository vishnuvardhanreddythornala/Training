package Oops.Abstraction;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s = new SavingsAccount();
		s.deposit();
		s.withdraw();
		
		CurrentAccount c = new CurrentAccount();
		c.deposit();
		c.withdraw();

	}

}
