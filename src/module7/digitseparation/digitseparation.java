// write a java program to print digit of a given number
package module7.digitseparation;

import java.util.Scanner;

public class digitseparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		while(n!=0) {
			int digit = n%10;
			System.out.println(digit);
			n = n/10;
			
		}
		sc.close();

	}

}
