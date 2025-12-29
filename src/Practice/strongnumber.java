// strong number
package Practice;
import java.util.Scanner;


public class strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
	
		int temp = num;
		while(num != 0) {
			int digit = num % 10;
			int fact = 1;
			for(int i = 1; i <= digit ; i++) {
				fact = fact *i;
		}
			
			sum = sum + fact;
			num = num/10;
		
		}
		if(temp == sum) {
			System.out.println(temp+" is strong number");
		}else {
			System.out.println(temp+ " is not a strong number");
		}
		
		
		

	}

}
