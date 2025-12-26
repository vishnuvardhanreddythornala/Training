//wajp to find smallest digit
package module7.digitseparation;
import java.util.Scanner;
public class largestdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int max = 0;
		while(num != 0) {
			int digit = num % 10;
			if(digit>max) {
				max = digit;
			}
			num = num/10;
		}
		System.out.println("Largest digit is : "+ max);
		
		sc.close();

	}

}
