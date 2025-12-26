/*
 * write a java program to create calculator class consists of 4 methods.
1. To add three variables
2. To multiply three variables
3. To subtract 4 variables
4. To add 2 variables.
 */
package module8.methods;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method start");
		Addition(12,13,14);
		Multiplication(2,4,1);
		Subtraction(4,5,6,7);
		Addition2(18,20);
		System.out.println("Main method end");

	}
	public static void Addition(int a , int b , int c) {
		int add = a+b+c;
		System.out.println("Addition of three variables is: "+add );
	}
	public static void Multiplication(int a , int b , int c) {
		int multiply = a*b*c;
		System.out.println("Multiplication of three variables is: "+multiply );
	}
	public static void Subtraction(int a , int b , int c, int d) {
		int subtract = (a+b)-(c-d);
		System.out.println("subtraction of four variables is: "+subtract );
	}
	public static void Addition2(int a , int b) {
		int add = a+b;
		System.out.println("Addition of two variables is: "+add );
	}
	
	

}
