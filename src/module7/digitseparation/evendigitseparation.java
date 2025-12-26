// write a program to print even digit of a given number
package module7.digitseparation;
import java.util.Scanner;
public class evendigitseparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		while(num != 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				System.out.println(digit);
			}
			num = num/10;
			
		}
		
		sc.close();
		

	}

}
