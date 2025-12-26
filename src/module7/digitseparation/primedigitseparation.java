package module7.digitseparation;
import java.util.Scanner;
public class primedigitseparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		while(num != 0) {
			int digit = num % 10;
			int count = 0;
			for(int i = 1; i <= digit; i++) {
				if(digit % i == 0) {
					count++;
				}
				
					
				}
			 if(count == 2) {
				System.out.println(digit + "");
				num = num / 10;
			}
		}
		sc.close();

	}

}
