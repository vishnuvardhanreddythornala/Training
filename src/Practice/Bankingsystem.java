/*
 * 🔹 Scenario 1: Banking System

	A bank wants to verify whether an entered PIN number is valid.
	Rules:
	
	PIN must be exactly 4 digits
	
	All digits must be even
	
	PIN must not be a palindrome
	
	👉 What concepts will you use?
	
	Expected concepts:
	
	Digit count
	
	Digit separation
	
	Even check
	
	Palindrome logic
 */
package Practice;
import java.util.Scanner;
public class Bankingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a PIN: ");
	        int pin = sc.nextInt();

	        int originalPin = pin;   // store original PIN
	        int temp = pin;
	        int count = 0;
	        int reverse = 0;
	        boolean allEven = true;

	        // Step 1, 2, 3 combined:
	        // digit count + even digit check + reverse number
	        while (temp != 0) {
	            int digit = temp % 10;

	            // count digits
	            count++;

	            // check even digit
	            if (digit % 2 != 0) {
	                allEven = false;
	            }

	            // reverse logic
	            reverse = reverse * 10 + digit;

	            temp = temp / 10;
	        }

	        // Step 4: Final validation
	        if (count == 4 && allEven && originalPin != reverse) {
	            System.out.println("Valid PIN");
	        } else {
	            System.out.println("Invalid PIN");
	        }

	        sc.close();
	}

}
