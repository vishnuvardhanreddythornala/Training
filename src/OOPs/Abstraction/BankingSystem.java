package Oops.Abstraction;
/*
 * Banking System (Main Question)

- Create an interface BankOperations with methods deposit(), withdraw(), and checkBalance().

- Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.

- Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).

- Store multiple accounts in an ArrayList<Account>.

Demonstrate runtime polymorphism while performing operations.
	Add features:
	Add a new account
	Remove an account by account number
	Search for an account
	Display all accounts
	Deposit/Withdraw money into/from a chosen account
 */
import java.util.List;
import java.util.ArrayList;
public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Account> al = new ArrayList<Account>();
		

	}

}

abstract class Account{
	private int accountNo;
	private String holderName;
	protected double balance;
	
	Account(int accountNo, String holderName, double balance){
		this.accountNo =  accountNo;
		this.holderName =  holderName;
		this.balance = balance;
	
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getHolderName() {
		return holderName;
	}
//	public double getBalance() {
//		return balance;
//	}

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

}
class SavingsAccount extends Account implements BankOperations{
    private static final double MIN_BALANCE = 1000;

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            addBalance(amount);
            System.out.println("SavingsAccount: Amount deposited successfully");
        }
    }

    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            deductBalance(amount);
            System.out.println("SavingsAccount: Amount withdrawn successfully");
        } else {
            System.out.println("SavingsAccount: Minimum balance violation");
        }
    }

    public void checkBalance() {
        System.out.println("SavingsAccount Balance: " + balance);
    }
}

class CurrentAccount extends Account implements BankOperations {

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            addBalance(amount);
            System.out.println("CurrentAccount: Amount deposited successfully");
        }
    }

    public void withdraw(double amount) {
        if (deductBalance(amount)) {
            System.out.println("CurrentAccount: Amount withdrawn successfully");
        } else {
            System.out.println("CurrentAccount: Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("CurrentAccount Balance: " + balance);
    }
}
interface BankOperations{
		void deposit(double amount);
		void withdraw(double amount);
		void checkBalance();
	
}
