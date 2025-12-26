//WAJP to check the given number is divisible by 7 or not.
package module1.conditionals;
import java.util.Scanner;
public class DivisibleBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num  =  sc.nextInt();
		if(num%7 == 0) {
			System.out.println(num + " is divisible by 7");
		}else {
			System.out.println(num + " is not divisible by 7");
		}
		sc.close();
		

	}

}
