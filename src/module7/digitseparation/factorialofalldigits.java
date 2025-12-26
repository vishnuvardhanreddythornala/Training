/*wajp to print factorial of all digits.
342
2! = 2
4! = 24
3! = 6
*/

package module7.digitseparation;
import java.util.Scanner;
public class factorialofalldigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		while(num != 0) {
			int digit = num%10;
			int fact = 1;
			for(int i = 1 ; i<= digit; i++) {
				fact = fact*i;
			
			}
			num = num/10;
			System.out.println(digit + "! = " + fact);
		}
		
		sc.close();

	}

}
