/*
 * .program to determine wheather a given number is a disarium number.
	A number is said to be the disarium number when the sum of its digit raised to the power of their respestive position is equal to the number itself.
	ex: 175
	1*1 +7*2 + 5*3
	1+49+125 = 175
 */
package module7.digitseparation;
import java.util.Scanner;

public class Disariumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		int t= num;
		int nod = 0;
	      
		while (t != 0) {
	            nod++;
	            t = t / 10;
	        }
		
		while(num != 0) {
			int digit = num % 10;
			int power = 1;
			 for (int i = 1; i <= nod; i++) {
				 power = power * digit;
	            }
			 sum += power;
	         nod--;
	         num = num / 10;
			
			
		}
		// Step 3: compare
        if (sum == temp) {
            System.out.println(temp + " is a Disarium number");
        } else {
            System.out.println(temp + " is not a Disarium number");
        }
		sc.close();
		

	}

}
