/*
 *Write a Java program that uses only parameterized methods (no logic in main) to analyze a given number.
	You must implement the following parameterized methods:

	Required Methods
	1.	int reverseNumber(int num)
	→ Returns the reverse of the number.
	
	2.	boolean isPalindrome(int num, int reversed)
	→ Returns true if the number is a palindrome.
	
	3.	boolean isStrongNumber(int num)
	→ Returns true if the number is a Strong Number
	
	4.	int countPrimeDigits(int num)
	→ Counts how many digits in the number are prime digits.
	
	5.	void numberReport(int num)
	→ Calls all the above methods and prints:
	•	Reverse of the number
	•	Whether it is Palindrome
	•	Whether it is Strong Number
	•	Count of prime digits
 */

package module8.methods;

public class NumberAnalysis {

    public static void main(String[] args) {
        numberReport(145);
    }

    // 1. Reverse Number
    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

    // 2. Check Palindrome
    public static boolean isPalindrome(int num, int reversed) {
        return num == reversed;
    }

    // 3. Strong Number
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int temp = num;

        while (num != 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        return temp == sum;
    }

    // 4. Count Prime Digits
    public static int countPrimeDigits(int num) {
        int count = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }

            num = num / 10;
        }

        return count;
    }

    // 5. Number Report
    public static void numberReport(int num) {
        int reversed = reverseNumber(num);

        System.out.println("Reverse of number: " + reversed);
        System.out.println("Is Palindrome: " + isPalindrome(num, reversed));
        System.out.println("Is Strong Number: " + isStrongNumber(num));
        System.out.println("Count of Prime Digits: " + countPrimeDigits(num));
    }
}

