package module17.Exception;
import java.util.Scanner;

class NotEligibleException extends Exception{
	public NotEligibleException(String msg) {
		System.out.println(msg);
	}

}

public class customException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		try {
			eligibleForVoting(age);
			
		}
		catch(NotEligibleException e) {
			e.printStackTrace();
		}
		System.out.println("Main end");
	}
	public static void eligibleForVoting(int age) throws NotEligibleException {
		if(age >= 18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new NotEligibleException("You are not eligible");
		}
		
	}

}
