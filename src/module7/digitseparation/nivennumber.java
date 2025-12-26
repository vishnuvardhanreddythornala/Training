
/*
 * niven number:
 * 24 is a niven number 
 * sum of digit is 6
 * 24 % 6 == 0 treu
 * 
 * 
 */
package module7.digitseparation;
import java.util.Scanner;
public class nivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		
		while(num != 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num/10;
		}
		if(temp % sum == 0) {
			System.out.println(temp + "is a niven number");
		}else {
			System.out.println(temp + "is not a niven number");
		}
		
		sc.close();

	}

}
