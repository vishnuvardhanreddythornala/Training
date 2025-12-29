//Write a program to reverse a given number.

package Practice;
import java.util.Scanner;
public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int rev = 0;
		
		while(num != 0) {
			int digit = num % 10;
			rev = rev*10 + digit;
			num = num /10;
			
		}
		System.out.println(rev);
		sc.close();

	}

}
