//write a java program to check weather the given character is uppercase character ,lowercase character, 
//digit or special character

package module1.conditionals;
import java.util.Scanner;

public class UpperLowerVowelConsonant {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if (ch >= 'A' && ch <= 'Z') {
	            System.out.println(ch + " charater is in uppercase!!");
	        } else if (ch >= 'a' && ch <= 'z') {
	            System.out.println(ch + " character is in lowercase!!");
	        } else if (ch >= '0' && ch <= '9') {
	            System.out.println(ch + " character contains digits!!");
	        } else {
	            System.out.println(ch + " charater consists of special characters");
	        }
	        sc.close();
	    }
	}



