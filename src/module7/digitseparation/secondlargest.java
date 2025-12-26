//second largest
package module7.digitseparation;
import java.util.Scanner;
public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int firstlargest = 0;
		int secondlargest = 0;
		
		while(num != 0) {
			int digit = num % 10;
			if(digit > firstlargest) {
				secondlargest = firstlargest;
				firstlargest = digit;
			}else if(digit < firstlargest && digit > secondlargest) {
				secondlargest = digit;
			}
			num = num/10;
		}
		System.out.println("second largest digit is: "+ secondlargest);
		sc.close();

	}

}
