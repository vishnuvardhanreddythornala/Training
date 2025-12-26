//WAJP to check the character is vowel or consonant.
package module1.conditionals;
import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char letter = sc.next().charAt(0);
		
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
			System.out.println("The character is and vowel");
		}else {
			System.out.println("The character is a consonant");
		}
		
		
		sc.close();

	}

}
