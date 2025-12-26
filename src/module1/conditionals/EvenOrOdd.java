// WAJP to check the given number is even or odd.
package module1.conditionals;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println(num+ " is an Even Number");
		}
		else {
			System.out.println(num + " is an odd number");
		}
		sc.close();
		

	}

}
