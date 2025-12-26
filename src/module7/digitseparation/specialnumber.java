/*
 * special number:
 * 19 is special  number
 * 1 9 
 * sum of digit 1+9 = 10
 * product of digit 1*9 = 9
 * total = sum of digit + product of digit
 * total is 19 and is equal to out original number hence its a special number
 */

package module7.digitseparation;
import java.util.Scanner;
public class specialnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		int temp = num;
		
		while(num != 0) {
			int digit = num % 10;
			sum = sum+ digit;
			product = product * digit ;
			num = num / 10;
		}
		int total = sum + product;
		if(total == temp) {
			System.out.println("special number");
		}else {
			System.out.println("not a special number");
		}
		sc.close();
		
	}

}
