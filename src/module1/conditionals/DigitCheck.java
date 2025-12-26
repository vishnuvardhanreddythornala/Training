//WAJP to check the given character is digit or not.
package module1.conditionals;
import java.util.Scanner;
public class DigitCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);{
			System.out.print("Enter a digit: ");
			char digit = sc.next().charAt(0);
			
			if(digit >='0' &&digit <= '9') {
				System.out.println("The given character is digit");
			}else {
				System.out.println("The given character is not a digit");
			}
			sc.close();
		}
		

	}

}
