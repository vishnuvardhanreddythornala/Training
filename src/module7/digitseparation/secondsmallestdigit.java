// second smallest digit
package module7.digitseparation;
import java.util.Scanner;
public class secondsmallestdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int smallest = 9;
		int secondsmallest = 9;
		
		while(num != 0) {
			int digit = num % 10;
			if(digit < smallest) {
				secondsmallest = smallest;
				smallest = digit;
			}else if(digit > smallest && digit < secondsmallest) {
				secondsmallest = digit;
			}
			num = num/10;
		}
		System.out.println("second smallest digit is: "+secondsmallest);
		sc.close();
		

	}

}
