/*
 * WAJP to perform Arithmetic operations using switch and user choice.
	addition
		add 2 variable
		add 3 variable
		add 4 variable
	subtraction
		sub 2 variable
		sub 3 variable
		sub 4 variable
	multiplication
		mul 2 variable
		mul 3 variable
		mul 4 variabl
	division
		divide 2 variable
 */

package Practice;
import java.util.Scanner;

public class arthematicswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int choice = sc.nextInt();
		double a, b , c, d ,result =0;
		System.out.println("How many numbers (2 / 3 / 4)? ");
		int count = sc.nextInt();
		
		switch(choice) {
		case 1: // Addition
			if(count == 2) {
				a = sc.nextDouble();
				b = sc.nextDouble();
				result = a+b;
			}else if(count == 3) {
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				result = a+b+c;
			}else if(count == 4) {
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				d = sc.nextDouble();
				result = a+b+c+d;
			}else {
				System.out.println("Invalid input");
			}
			System.out.println("Result: " + result);
			break;
		case 2:
		}
		

	}

}
