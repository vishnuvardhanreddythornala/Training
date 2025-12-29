//Write a program to check whether a number is Palindrome or not

package Practice;
import java.util.Scanner;

public class palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		while(num != 0 ) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num/10;
		}
		if(temp == rev) {
			System.out.println(temp + " is a palindrome");
		}else {
			System.out.println(temp+" not a palindrome");
		}
		sc.close();
		

	}

}
