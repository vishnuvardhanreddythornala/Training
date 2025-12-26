//wajp to print all the odd numbers from the range 500 to 50 without usingf loop.
package module9.recursion;

public class numbers500to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(500);

	}
	public static void printNumbers(int n) {
		if(n >= 50) {
			System.out.println(n);
			printNumbers(--n);
		}
		
	}

}
