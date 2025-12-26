//wajp to find smallest digit
package module7.digitseparation;
import java.util.Scanner;
public class smallestdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int min = 9;
		
		while(num != 0 ) {
			int digit = num % 10;
			if(digit<min) {
				min = digit;
			}
			
			num = num/10;
		}
        System.out.println("Smallest digit is: " + min);

		sc.close();

	}

}
