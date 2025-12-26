//WAJP to check the given number is divisible by 3 and 5 or not.
package module1.conditionals;
import java.util.Scanner;
public class DivisibleBy3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num%3 == 0 && num% 5 == 0) {
			System.out.println(num + " is divisible by 3 and 5");
		}else {
			System.out.println(num + " is not divisible by 3 and 5");
		}
		sc.close();
		

	}

}
